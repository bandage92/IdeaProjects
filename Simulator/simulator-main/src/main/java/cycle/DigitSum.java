package cycle;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(calculateDigitSum(number));
        }
    }

    static String calculateDigitSum(int number) {
        String result = "";
        //TODO: Вычислите сумму цифр числа
        // Напишите программу, которая вычисляет сумму цифр числа
        // Для отрицательных чисел используйте модуль числа
        // Для 0 верните "0"
        return result;
    }
}
