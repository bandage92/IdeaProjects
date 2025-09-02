package cycle;

import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(printMultiplicationTable(n));
        }
    }

    static List<String> printMultiplicationTable(int n) {
        List<String> result = new java.util.ArrayList<>();
        //TODO: Таблица умножения
        // Напишите программу, которая выводит таблицу умножения
        // для числа N от 1 до 10. Например, для N = 3
        // вывод должен быть:
        // 3 * 1 = 3
        // 3 * 2 = 6
        // 3 * 3 = 9
        // 3 * 4 = 12 и тд
        return result;
    }
}
