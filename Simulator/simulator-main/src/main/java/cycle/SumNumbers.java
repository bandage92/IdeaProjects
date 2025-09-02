package cycle;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(sumNumbers(n));
        }
    }

    static String sumNumbers(int n) {
        String result = "";
        //TODO: Вычислите сумму чисел от 1 до N
        // Напишите программу, которая вычисляет сумму чисел от 1 до N
        // Для N <= 0 верните "Invalid number"
        return result;
    }
}
