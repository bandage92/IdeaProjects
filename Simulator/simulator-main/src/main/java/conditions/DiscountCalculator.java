package conditions;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите сумму покупки: ");
            double amount = scanner.nextDouble();

            System.out.println(calculateDiscount(amount));
        }
    }

    static String calculateDiscount(double amount) {
        String result = "";
        //TODO: Рассчитайте скидку
        // Напишите программу, которая рассчитывает скидку:
        // >= 5000 -> 10% скидка
        // >= 1000 -> 5% скидка
        // < 1000 -> без скидки
        // Верните строку с суммой скидки, округленной до 2 знаков
        // Для отрицательных сумм верните "Invalid amount"
        return result;
    }
}
