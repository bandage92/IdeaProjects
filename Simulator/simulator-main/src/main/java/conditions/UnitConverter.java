package conditions;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите значение: ");
            double value = scanner.nextDouble();
            System.out.print("Введите исходную единицу (km, m, cm): ");
            String fromUnit = scanner.next();
            System.out.print("Введите целевую единицу (km, m, cm): ");
            String toUnit = scanner.next();

            System.out.println(convertUnit(value, fromUnit, toUnit));
        }
    }

    static String convertUnit(double value, String fromUnit, String toUnit) {
        String result = "";
        //TODO: Конвертируйте значение из одной единицы измерения в другую
        // Напишите программу для конвертации между километрами, метрами и сантиметрами
        // Поддерживаемые единицы:
        // - km (километры)
        // - m (метры)
        // - cm (сантиметры)
        // Соотношения:
        // 1 km = 1000 m
        // 1 m = 100 cm
        // Результат округлите до 2 знаков после запятой
        // Для неподдерживаемых единиц верните "Invalid unit"
        // Для отрицательных значений верните "Invalid value"
        return result;
    }
}
