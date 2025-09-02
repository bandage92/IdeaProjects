package cycle;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();

            System.out.println(printEvenNumbersToString(n));
        }
    }

    static String printEvenNumbersToString(int n) {
        String result = "";
        //TODO:Четные числа от 1 до N
        // Напишите программу, которая принимает число N
        // и выводит все четные числа от 1 до N. Например,
        // для N = 10 результат будет: 2, 4, 6, 8, 10.
        return result.trim();
    }
}
