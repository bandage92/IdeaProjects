package cycle;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(calculateSum(n));
        }
    }

    static String calculateSum(int n) {
        String result = "";
        //TODO: Вычислите сумму чисел от 1 до N
        // Напишите программу, которая вычисляет сумму чисел от 1 до N
        // Для N <= 0 верните "Invalid number"
        return result;
    }
}
