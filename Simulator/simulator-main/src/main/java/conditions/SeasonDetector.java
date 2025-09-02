package conditions;
import java.util.Scanner;

public class SeasonDetector {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер месяца (1-12): ");
            int month = scanner.nextInt();

            System.out.println(detectSeason(month));
        }
    }

    static String detectSeason(int month) {
        String result = "";
        //TODO: Определите время года по номеру месяца
        // Напишите программу, которая определяет время года по номеру месяца
        // 12, 1, 2 - Winter
        // 3, 4, 5 - Spring
        // 6, 7, 8 - Summer
        // 9, 10, 11 - Autumn
        // Для некорректного номера месяца верните "Invalid month"
        return result;
    }
}
