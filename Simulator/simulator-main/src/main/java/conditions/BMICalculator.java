package conditions;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите вес в кг: ");
            double weight = scanner.nextDouble();
            System.out.print("Введите рост в метрах: ");
            double height = scanner.nextDouble();

            System.out.println(calculateBMICategory(weight, height));
        }
    }

    static String calculateBMICategory(double weight, double height) {
        String result = "";
        //TODO: Рассчитайте индекс массы тела и определите категорию
        // Напишите программу, которая рассчитывает индекс массы тела (BMI)
        // и определяет категорию:
        // BMI = вес / (рост * рост)
        // BMI < 18.5: "Underweight"
        // 18.5 <= BMI < 25.0: "Normal weight"
        // 25.0 <= BMI < 30.0: "Overweight"
        // BMI >= 30.0: "Obese"
        // Если вес <= 0 или рост <= 0: "Invalid input"
        // Используйте условные операторы if для решения
        return result;
    }
}
