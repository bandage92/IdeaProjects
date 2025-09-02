package conditions;
import java.util.Scanner;

public class TriangleAngleClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первый угол: ");
            int angle1 = scanner.nextInt();
            System.out.print("Введите второй угол: ");
            int angle2 = scanner.nextInt();
            System.out.print("Введите третий угол: ");
            int angle3 = scanner.nextInt();

            System.out.println(classifyTriangle(angle1, angle2, angle3));
        }
    }

    static String classifyTriangle(int angle1, int angle2, int angle3) {
        String result = "";
        //TODO: Определите тип треугольника по углам
        // Напишите программу, которая определяет тип треугольника по углам:
        // - Acute (остроугольный) - все углы < 90°
        // - Right (прямоугольный) - один угол = 90°
        // - Obtuse (тупоугольный) - один угол > 90°
        // Если сумма углов не равна 180° или углы <= 0,
        // верните "Invalid triangle"
        return result;
    }
}
