package cycle;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(isPerfectNumber(number));
        }
    }

    static String isPerfectNumber(int number) {
        String result = "";
        //TODO: Проверьте, является ли число совершенным
        // Напишите программу, которая проверяет, является ли число совершенным
        // Совершенное число - это число, равное сумме всех своих делителей,
        // кроме самого себя
        // Например: 6 = 1 + 2 + 3
        // Для отрицательных чисел и 0 верните "Invalid number"
        return result;
    }
}
