package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    @Test
    public void testUnderweight() {
        assertEquals("Underweight", BMICalculator.calculateBMICategory(50, 1.7));  // BMI ≈ 17.3
        assertEquals("Underweight", BMICalculator.calculateBMICategory(45, 1.6));  // BMI ≈ 17.6
    }

    @Test
    public void testNormalWeight() {
        assertEquals("Normal weight", BMICalculator.calculateBMICategory(60, 1.7));  // BMI ≈ 20.8
        assertEquals("Normal weight", BMICalculator.calculateBMICategory(70, 1.75)); // BMI ≈ 22.9
    }

    @Test
    public void testOverweight() {
        assertEquals("Overweight", BMICalculator.calculateBMICategory(80, 1.7));   // BMI ≈ 27.7
        assertEquals("Overweight", BMICalculator.calculateBMICategory(85, 1.75));  // BMI ≈ 27.8
    }

    @Test
    public void testObese() {
        assertEquals("Obese", BMICalculator.calculateBMICategory(100, 1.7));  // BMI ≈ 34.6
        assertEquals("Obese", BMICalculator.calculateBMICategory(110, 1.75)); // BMI ≈ 35.9
    }

    @Test
    public void testInvalidInput() {
        assertEquals("Invalid input", BMICalculator.calculateBMICategory(0, 1.7));
        assertEquals("Invalid input", BMICalculator.calculateBMICategory(-50, 1.7));
        assertEquals("Invalid input", BMICalculator.calculateBMICategory(70, 0));
        assertEquals("Invalid input", BMICalculator.calculateBMICategory(70, -1.7));
    }

    public static class BMICalculator {

        public static String calculateBMICategory (int weight, double height) {
            if (weight <= 0 || height <= 0) {
                return "Invalid input";
            }

            double bmi = weight / (height * height);

            if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25) {
                return "Normal weight";
            } else if (bmi < 30) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }
    }
}