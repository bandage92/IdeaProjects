package conditions;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите текущий цвет светофора (red/yellow/green): ");
            String currentColor = scanner.nextLine().toLowerCase();
            System.out.print("Введите время ожидания в секундах: ");
            int waitTime = scanner.nextInt();

            System.out.println(getNextColor(currentColor, waitTime));
        }
    }

    static String getNextColor(String currentColor, int waitTime) {
        String result = "";
        //TODO: Определите следующий цвет светофора
        // Напишите программу, которая определяет следующий цвет светофора:
        // Правила переключения:
        // - red -> green (через 2 минуты)
        // - green -> yellow (через 2 минуты)
        // - yellow -> red (через 30 секунд)
        // Если время ожидания достаточное, верните следующий цвет
        // Если время ожидания недостаточное, верните текущий цвет
        // Для некорректного цвета верните "Invalid color"
        // Для отрицательного времени верните "Invalid time"
        // Используйте switch/case для решения
        return result;
    }
}
