package cycle;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();

            System.out.println(reverseString(text));
        }
    }

    static String reverseString(String text) {
        String result = "";
        //TODO: Переверните строку
        // Напишите программу, которая переворачивает строку
        // Для пустой строки верните "Empty string"
        return result;
    }
}
