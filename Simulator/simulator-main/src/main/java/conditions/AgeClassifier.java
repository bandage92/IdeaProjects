package conditions;
import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            System.out.println(classifyAge(age));
        }
    }

    static String classifyAge(int age) {
        String result = "";
        //TODO: Определите возрастную категорию
        // Напишите программу, которая классифицирует возраст:
        // 0-2: "Infant"
        // 3-12: "Child"
        // 13-19: "Teen"
        // 20-65: "Adult"
        // 66+: "Senior"
        // Отрицательный возраст: "Invalid age"
        // Используйте условные операторы if для решения
        return result;
    }
}
