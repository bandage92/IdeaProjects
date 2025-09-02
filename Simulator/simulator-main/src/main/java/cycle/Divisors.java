package cycle;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(findDivisors(number));
        }
    }

    static String findDivisors(int number) {
        String result = "";
        //TODO: Найдите все делители числа
        // Напишите программу, которая находит все делители числа
        // Делитель - это число, на которое исходное число делится без остатка
        // Делители должны быть перечислены через запятую в порядке возрастания
        // Для отрицательных чисел используйте модуль числа
        // Для 0 верните "Invalid number"
        return result;
    }
}
