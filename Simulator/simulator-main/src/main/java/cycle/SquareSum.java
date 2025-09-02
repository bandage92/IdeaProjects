package cycle;
import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(calculateSquareSum(n));
        }
    }

    static String calculateSquareSum(int n) {
        String result = "";
        //TODO: Посчитайте сумму квадратов чисел от 1 до N
        // Напишите программу, которая считает сумму квадратов чисел от 1 до N
        // Например, для N = 3 результат будет "14" (1² + 2² + 3² = 1 + 4 + 9 = 14)
        // Для N = 0 верните "0"
        // Для отрицательных N верните "Invalid number"
        // Используйте цикл for для решения
        return result;
    }
}
