package cycle;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();

            System.out.println(isPalindrome(text));
        }
    }

    static String isPalindrome(String text) {
        String result = "";
        //TODO: Проверьте, является ли строка палиндромом
        // Напишите программу, которая проверяет, является ли строка палиндромом
        // Палиндром - это строка, которая читается одинаково слева направо и справа налево
        // Игнорируйте регистр букв и пробелы
        // Для пустой строки верните "Empty string"
        return result;
    }
}
