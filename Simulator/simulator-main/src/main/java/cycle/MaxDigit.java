package cycle;
import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(findMaxDigit(number));
        }
    }

    static String findMaxDigit(int number) {
        String result = "";
        //TODO: Найдите максимальную цифру в числе
        // Напишите программу, которая находит максимальную цифру в числе
        // Например:
        // 123 -> "3"
        // 9735 -> "9"
        // Для отрицательных чисел используйте их модуль
        // Для 0 верните "0"
        // Используйте цикл while для получения цифр числа
        return result;
    }
}
