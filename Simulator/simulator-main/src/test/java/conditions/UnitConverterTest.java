package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Locale;

public class UnitConverterTest {

    @Test
    public void testKilometersToMeters() {
        assertEquals("1000.00", UnitConverter.convertUnit(1, "km", "m"));
        assertEquals("2000.00", UnitConverter.convertUnit(2, "km", "m"));
        assertEquals("0.50", UnitConverter.convertUnit(0.0005, "km", "m"));
    }

    @Test
    public void testMetersToKilometers() {
        assertEquals("1.00", UnitConverter.convertUnit(1000, "m", "km"));
        assertEquals("2.00", UnitConverter.convertUnit(2000, "m", "km"));
        assertEquals("0.50", UnitConverter.convertUnit(500, "m", "km"));
    }

    @Test
    public void testMetersToCentimeters() {
        assertEquals("100.00", UnitConverter.convertUnit(1, "m", "cm"));
        assertEquals("200.00", UnitConverter.convertUnit(2, "m", "cm"));
        assertEquals("50.00", UnitConverter.convertUnit(0.5, "m", "cm"));
    }

    @Test
    public void testCentimetersToMeters() {
        assertEquals("1.00", UnitConverter.convertUnit(100, "cm", "m"));
        assertEquals("2.00", UnitConverter.convertUnit(200, "cm", "m"));
        assertEquals("0.50", UnitConverter.convertUnit(50, "cm", "m"));
    }

    @Test
    public void testKilometersToCentimeters() {
        assertEquals("100000.00", UnitConverter.convertUnit(1, "km", "cm"));
        assertEquals("200000.00", UnitConverter.convertUnit(2, "km", "cm"));
        assertEquals("50000.00", UnitConverter.convertUnit(0.5, "km", "cm"));
    }

    @Test
    public void testCentimetersToKilometers() {
        assertEquals("1.00", UnitConverter.convertUnit(100000, "cm", "km"));
        assertEquals("2.00", UnitConverter.convertUnit(200000, "cm", "km"));
        assertEquals("0.50", UnitConverter.convertUnit(50000, "cm", "km"));
    }

    @Test
    public void testInvalidUnits() {
        assertEquals("Invalid unit", UnitConverter.convertUnit(1, "km", "mm"));
        assertEquals("Invalid unit", UnitConverter.convertUnit(1, "mm", "km"));
        assertEquals("Invalid unit", UnitConverter.convertUnit(1, "", "km"));
    }

    @Test
    public void testInvalidValues() {
        assertEquals("Invalid value", UnitConverter.convertUnit(-1, "km", "m"));
        assertEquals("Invalid value", UnitConverter.convertUnit(-100, "m", "cm"));
        assertEquals("Invalid value", UnitConverter.convertUnit(-0.5, "km", "cm"));
    }

    public static class UnitConverter {

        public static String convertUnit(double value, String fromUnit, String toUnit) {
            // Проверка на отрицательное значение
            if (value < 0) {
                return "Invalid value";
            }

            // Проверка поддерживаемых единиц измерения
            if (isValidUnit(fromUnit) || isValidUnit(toUnit)) {
                return "Invalid unit";
            }

            // Конвертация в метры (промежуточная единица)
            double meters;
            switch (fromUnit) {
                case "km":
                    meters = value * 1000;
                    break;
                case "m":
                    meters = value;
                    break;
                case "cm":
                    meters = value / 100;
                    break;
                default:
                    return "Invalid unit";
            }

            // Конвертация из метров в целевую единицу
            double result;
            switch (toUnit) {
                case "km":
                    result = meters / 1000;
                    break;
                case "m":
                    result = meters;
                    break;
                case "cm":
                    result = meters * 100;
                    break;
                default:
                    return "Invalid unit";
            }

            // Форматирование результата с двумя знаками после запятой
            return String.format(Locale.ROOT, "%.2f", result);
        }

        private static boolean isValidUnit(String unit) {
            return !unit.equals("km") && !unit.equals("m") && !unit.equals("cm");
        }
    }
}