package cycle;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(reverseNumbers(n));
        }
    }

    static String reverseNumbers(int n) {
        String result = "";
        //TODO: Выведите числа от N до 1 в обратном порядке
        // Напишите программу, которая выводит числа от N до 1 в обратном порядке
        // Числа должны быть разделены пробелом
        // Для N <= 0 верните "Invalid number"
        return result;
    }
}
