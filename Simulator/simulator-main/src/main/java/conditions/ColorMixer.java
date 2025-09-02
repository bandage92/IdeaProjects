package conditions;
import java.util.Scanner;

public class ColorMixer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первый цвет (red, blue, yellow): ");
            String color1 = scanner.nextLine().toLowerCase();
            System.out.print("Введите второй цвет (red, blue, yellow): ");
            String color2 = scanner.nextLine().toLowerCase();

            System.out.println(mixColors(color1, color2));
        }
    }

    static String mixColors(String color1, String color2) {
        String result = "";
        //TODO: Определите результат смешивания цветов
        // Напишите программу, которая определяет результат смешивания основных цветов:
        // red + blue = purple
        // red + yellow = orange
        // blue + yellow = green
        // Если цвета одинаковые, верните этот цвет
        // Если какой-то из цветов неизвестен, верните "Unknown color"
        // Используйте условные операторы if для решения
        return result;
    }
}
