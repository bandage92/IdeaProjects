package conditions;
import java.util.Scanner;

public class NumberCategory {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(determineNumberCategory(number));
        }
    }

    static String determineNumberCategory(int number) {
        String result = "";
        //TODO: Определите категорию числа
        // Напишите программу, которая определяет, является ли введенное число:
        // - положительным ("Positive")
        // - отрицательным ("Negative")
        // - нулем ("Zero")
        // Например: для числа 5 результат будет "Positive"
        //          для числа -3 результат будет "Negative"
        //          для числа 0 результат будет "Zero"
        return result;
    }
}
