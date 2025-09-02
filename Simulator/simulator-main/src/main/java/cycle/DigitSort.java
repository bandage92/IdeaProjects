package cycle;
import java.util.Scanner;

public class DigitSort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(sortDigits(number));
        }
    }

    static String sortDigits(int number) {
        String result = "";
        //TODO: Отсортируйте цифры числа по возрастанию
        // Напишите программу, которая сортирует цифры числа по возрастанию
        // Например: 231 -> 123
        // Для отрицательных чисел используйте их модуль
        // Для 0 верните "0"
        return result;
    }
}
