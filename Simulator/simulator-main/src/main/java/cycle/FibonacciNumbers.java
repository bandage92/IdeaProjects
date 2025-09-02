package cycle;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество чисел Фибоначчи N: ");
            int n = scanner.nextInt();

            System.out.println(generateFibonacci(n));
        }
    }

    static String generateFibonacci(int n) {
        String result = "";
        //TODO: Сгенерируйте первые N чисел Фибоначчи
        // Напишите программу, которая генерирует первые N чисел последовательности Фибоначчи
        // Каждое следующее число - сумма двух предыдущих
        // Первые два числа: 0 и 1
        // Например, для N = 5 результат будет "0 1 1 2 3"
        // Для N <= 0 верните "Invalid number"
        // Используйте цикл for для решения
        return result;
    }
}
