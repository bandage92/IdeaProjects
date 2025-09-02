package cycle;
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(calculateSeriesSum(n));
        }
    }

    static String calculateSeriesSum(int n) {
        String result = "";
        //TODO: Вычислите сумму ряда 1 + 1/2 + 1/3 + ... + 1/N
        // Напишите программу, которая вычисляет сумму ряда
        // 1 + 1/2 + 1/3 + ... + 1/N
        // Результат округлите до 3 знаков после запятой
        // Например:
        // N = 3 -> "1.833" (1 + 0.5 + 0.333...)
        // Для N <= 0 верните "Invalid number"
        // Используйте double для вычислений
        // Для форматирования используйте String.format("%.3f", sum)
        return result;
    }
}
