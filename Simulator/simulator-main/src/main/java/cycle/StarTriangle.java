package cycle;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите высоту треугольника: ");
            int height = scanner.nextInt();

            System.out.println(drawTriangle(height));
        }
    }

    static String drawTriangle(int height) {
        String result = "";
        //TODO: Нарисуйте треугольник из звездочек
        // Напишите программу, которая рисует треугольник из звездочек
        // Высота треугольника задается параметром height
        // Каждая следующая строка должна содержать на 2 звездочки больше,
        // чем предыдущая
        // Для height <= 0 верните "Invalid height"
        return result;
    }
}
