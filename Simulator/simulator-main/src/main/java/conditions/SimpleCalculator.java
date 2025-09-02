package conditions;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.next();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println(calculate(num1, operation, num2));
        }
    }

    static String calculate(double num1, String operation, double num2) {
        String result = "";
        //TODO: Реализуйте простой калькулятор
        // Напишите программу-калькулятор, которая выполняет базовые операции:
        // + : сложение
        // - : вычитание
        // * : умножение
        // / : деление
        // Верните результат в виде строки с двумя знаками после запятой
        // При делении на 0 верните "Division by zero"
        // При неизвестной операции верните "Unknown operation"
        // Используйте switch/case для выбора операции
        return result;
    }
}
