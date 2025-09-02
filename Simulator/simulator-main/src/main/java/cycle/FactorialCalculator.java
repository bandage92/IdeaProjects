package cycle;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(calculateFactorial(n));
        }
    }

    static String calculateFactorial(int n) {
        String result = "";
        //TODO: Посчитайте факториал числа N
        // Напишите программу, которая считает факториал числа N
        // Факториал - произведение всех чисел от 1 до N
        // Например, для N = 5 результат будет 120 (1 * 2 * 3 * 4 * 5)
        // Для N = 0 результат должен быть 1
        // Для отрицательного N верните "Invalid number"
        // Используйте цикл for для решения
        return result;
    }
}
