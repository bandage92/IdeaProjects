package cycle;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(countDigits(number));
        }
    }

    static String countDigits(int number) {
        String result = "";
        //TODO: Подсчитайте количество цифр в числе
        // Напишите программу, которая подсчитывает количество цифр в числе
        // Для отрицательных чисел используйте их модуль
        // Для 0 верните "1"
        return result;
    }
}
