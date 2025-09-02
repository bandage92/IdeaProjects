package cycle;
import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(reverseNumber(number));
        }
    }

    static String reverseNumber(int number) {
        String result = "";
        //TODO: Переверните число
        // Напишите программу, которая переворачивает цифры в числе
        // Например: 1234 -> 4321
        // Для отрицательных чисел сначала найдите реверс модуля числа,
        // затем добавьте знак минус
        // Для 0 верните "0"
        return result;
    }
}
