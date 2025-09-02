package conditions;
import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите час (0-23): ");
            int hour = scanner.nextInt();

            System.out.println(getTimeOfDay(hour));
        }
    }

    static String getTimeOfDay(int hour) {
        String result = "";
        //TODO: Определите время суток
        // Напишите программу, которая определяет время суток по часу:
        // 5-11: "Morning"
        // 12-16: "Afternoon"
        // 17-21: "Evening"
        // 22-4: "Night"
        // Для некорректного часа верните "Invalid hour"
        // Используйте switch/case для решения
        return result;
    }
}
