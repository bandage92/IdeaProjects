package cycle;
import java.util.Scanner;

public class ReverseCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите начальное число N: ");
            int n = scanner.nextInt();

            System.out.println(countDown(n));
        }
    }

    static String countDown(int n) {
        String result = "";
        //TODO: Реализуйте обратный отсчет
        // Напишите программу, которая выводит числа от N до 1
        // Например, для N = 5 результат будет "5 4 3 2 1"
        // Для N <= 0 верните "Invalid number"
        // Используйте цикл for или while для решения
        return result;
    }
}
