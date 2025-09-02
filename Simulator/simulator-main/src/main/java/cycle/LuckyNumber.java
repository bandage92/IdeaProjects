package cycle;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите шестизначное число: ");
            int number = scanner.nextInt();

            System.out.println(isLuckyNumber(number));
        }
    }

    static String isLuckyNumber(int number) {
        String result = "";
        //TODO: Проверьте, является ли число счастливым
        // Напишите программу, которая проверяет, является ли шестизначное число счастливым
        // Счастливое число - это шестизначное число, у которого сумма первых трех цифр
        // равна сумме последних трех цифр
        // Например: 123321 - счастливое число (1+2+3 = 3+2+1)
        // Для числа не из 6 цифр верните "Invalid number"
        // Для отрицательных чисел используйте их модуль
        // Используйте цикл while для получения цифр числа
        return result;
    }
}
