package cycle;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите степень числа 2 (N): ");
            int n = scanner.nextInt();

            System.out.println(calculatePower(n));
        }
    }

    static String calculatePower(int n) {
        String result = "";
        //TODO: Вычислите 2 в степени N
        // Напишите программу, которая вычисляет 2^N (2 в степени N)
        // Например, для N = 3 результат будет "8" (2 * 2 * 2)
        // Для отрицательных N верните "Invalid number"
        // Используйте цикл for для решения
        return result;
    }
}
