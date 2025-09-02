package conditions;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первую сторону треугольника: ");
            int a = scanner.nextInt();
            System.out.print("Введите вторую сторону треугольника: ");
            int b = scanner.nextInt();
            System.out.print("Введите третью сторону треугольника: ");
            int c = scanner.nextInt();

            System.out.println(classifyTriangle(a, b, c));
        }
    }

    static String classifyTriangle(int a, int b, int c) {
        String result = "";
        //TODO: Классифицируйте треугольник по сторонам
        // Напишите программу, которая определяет тип треугольника по длинам его сторон
        // Равносторонний: все стороны равны
        // Равнобедренный: две стороны равны
        // Разносторонний: все стороны разные
        // Проверьте также, может ли существовать треугольник с такими сторонами
        // (каждая сторона должна быть меньше суммы двух других сторон)
        // Для отрицательных или нулевых значений верните "Invalid triangle"
        return result;
    }
}
