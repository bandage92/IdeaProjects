package conditions;
import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите день: ");
            int day = scanner.nextInt();
            System.out.print("Введите месяц: ");
            int month = scanner.nextInt();
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.println(isValidDate(day, month, year));
        }
    }

    static String isValidDate(int day, int month, int year) {
        String result = "";
        //TODO: Проверьте правильность даты
        // Напишите программу, которая проверяет правильность введенной даты
        // Учтите следующие правила:
        // - Год должен быть положительным
        // - Месяц должен быть от 1 до 12
        // - День должен соответствовать месяцу и году (учесть високосные годы)
        // - В феврале 28 дней (29 в високосный год)
        // - В апреле, июне, сентябре и ноябре 30 дней
        // - В остальных месяцах 31 день
        // Для правильной даты верните "Valid date"
        // Для неправильной даты верните "Invalid date"
        return result;
    }
}
