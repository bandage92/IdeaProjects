package cycle;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(isPrime(number));
        }
    }

    static String isPrime(int number) {
        String result = "";
        //TODO: Проверьте, является ли число простым
        // Напишите программу, которая проверяет, является ли число простым
        // Простое число - это число, которое делится только на 1 и на себя
        // Для чисел <= 1 верните "Invalid number"
        return result;
    }
}
