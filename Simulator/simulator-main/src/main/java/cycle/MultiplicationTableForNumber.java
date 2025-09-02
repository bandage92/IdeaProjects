package cycle;
import java.util.Scanner;

public class MultiplicationTableForNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            System.out.println(generateTable(number));
        }
    }

    static String generateTable(int number) {
        String result = "";
        //TODO: Создайте таблицу умножения для заданного числа
        // Напишите программу, которая создает таблицу умножения для заданного числа
        // от 1 до 10
        // Например, для числа 5:
        // "5 x 1 = 5
        //  5 x 2 = 10
        //  5 x 3 = 15
        //  ...
        //  5 x 10 = 50"
        // Каждая строка должна заканчиваться переносом строки (\n)
        // Для отрицательных чисел используйте их модули
        // Для 0 верните "Invalid number"
        return result;
    }
}
