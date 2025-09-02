package conditions;
import java.util.Scanner;

public class QuadrantDetector {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите координату X: ");
            double x = scanner.nextDouble();
            System.out.print("Введите координату Y: ");
            double y = scanner.nextDouble();

            System.out.println(detectQuadrant(x, y));
        }
    }

    static String detectQuadrant(double x, double y) {
        String result = "";
        //TODO: Определите, в каком квадранте находится точка
        // Напишите программу, которая определяет, в каком квадранте
        // координатной плоскости находится точка (x, y)
        // Квадранты нумеруются от 1 до 4 против часовой стрелки:
        // - Квадрант 1: x > 0, y > 0
        // - Квадрант 2: x < 0, y > 0
        // - Квадрант 3: x < 0, y < 0
        // - Квадрант 4: x > 0, y < 0
        // Если точка лежит на оси, верните "On axis"
        // Если точка в начале координат (0,0), верните "Origin"
        return result;
    }
}
