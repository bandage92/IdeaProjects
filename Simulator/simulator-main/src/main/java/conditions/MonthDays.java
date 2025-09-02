package conditions;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер месяца (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.println(getDaysInMonth(month, year));
        }
    }

    static String getDaysInMonth(int month, int year) {
        String result = "";
        //TODO: Определите количество дней в месяце
        // Напишите программу, которая определяет количество дней в месяце
        // Учтите високосные годы (год, который делится на 4 и не делится на 100,
        // либо делится на 400)
        // Для некорректного номера месяца верните "Invalid month"
        // Для некорректного года верните "Invalid year"
        return result;
    }
}
