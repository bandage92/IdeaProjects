package cycle;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(isArmstrongNumber(number));
        }
    }

    static String isArmstrongNumber(int number) {
        String result = "";
        //TODO: Проверьте, является ли число числом Армстронга
        // Напишите программу, которая проверяет, является ли число числом Армстронга
        // Число Армстронга - это число, которое равно сумме своих цифр,
        // возведенных в степень, равную количеству его цифр
        // Например:
        // 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 -> "Armstrong number"
        // 370 = 3³ + 7³ + 0³ = 27 + 343 + 0 = 370 -> "Armstrong number"
        // 12 != 1² + 2² = 1 + 4 = 5 -> "Not Armstrong number"
        // Для отрицательных чисел используйте их модуль
        // Для 0 верните "Armstrong number"
        return result;
    }
}
