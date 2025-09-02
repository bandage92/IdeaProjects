package conditions;
import java.util.Scanner;

public class LeapCentury {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.println(isLeapCentury(year));
        }
    }

    static String isLeapCentury(int year) {
        String result = "";
        //TODO: Проверьте, является ли столетие високосным
        // Напишите программу, которая определяет, является ли год, кратный 100,
        // високосным столетием
        // Год, кратный 100, является високосным столетием, только если он делится на 400
        // Например:
        // 2000 -> "Leap century"
        // 1900 -> "Not leap century"
        // Для отрицательных чисел и чисел, не кратных 100, верните "Invalid year"
        return result;
    }
}
