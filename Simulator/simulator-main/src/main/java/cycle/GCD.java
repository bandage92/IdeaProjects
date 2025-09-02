package cycle;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            System.out.println(findGCD(a, b));
        }
    }

    static String findGCD(int a, int b) {
        String result = "";
        //TODO: Найдите НОД двух чисел
        // Напишите программу, которая находит наибольший общий делитель двух чисел
        // Используйте алгоритм Евклида:
        // - Большее число делим на меньшее
        // - Если делится без остатка, то меньшее число и есть НОД
        // - Если есть остаток, то большее число заменяем на остаток от деления
        // - Повторяем пока не найдем НОД
        // Для отрицательных чисел используйте их модули
        // Для 0 верните "Invalid number"
        return result;
    }
}
