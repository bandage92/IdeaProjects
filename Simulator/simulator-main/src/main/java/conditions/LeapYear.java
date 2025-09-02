package conditions;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.println(isLeapYear(year));
        }
    }

    static String isLeapYear(int year) {
        String result = "";
        //TODO: Определите, является ли год високосным
        // Напишите программу, которая определяет, является ли год високосным
        // Високосный год: делится на 4 и не делится на 100,
        // либо делится на 400
        // Для високосного года верните "Leap year"
        // Для обычного года верните "Not a leap year"
        // Для отрицательных значений верните "Invalid year"
        return result;
    }
}
