package conditions;
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите оценку (0-100): ");
            int score = scanner.nextInt();

            System.out.println(convertGrade(score));
        }
    }

    static String convertGrade(int score) {
        String result = "";
        //TODO: Преобразуйте числовую оценку в буквенную
        // Напишите программу, которая преобразует числовую оценку (0-100) в буквенную:
        // 90-100 -> A
        // 80-89  -> B
        // 70-79  -> C
        // 60-69  -> D
        // 0-59   -> F
        // Для некорректных значений верните "Invalid score"
        return result;
    }
}
