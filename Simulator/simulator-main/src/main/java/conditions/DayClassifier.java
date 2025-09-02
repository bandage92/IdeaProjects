package conditions;
import java.util.Scanner;

public class DayClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер дня недели (1-7): ");
            int day = scanner.nextInt();

            System.out.println(classifyDay(day));
        }
    }

    static String classifyDay(int day) {
        String result = "";
        //TODO: Определите тип дня недели
        // Напишите программу, которая определяет тип дня недели:
        // 1-5 -> "Weekday"
        // 6-7 -> "Weekend"
        // Для остальных чисел верните "Invalid day"
        return result;
    }
}
