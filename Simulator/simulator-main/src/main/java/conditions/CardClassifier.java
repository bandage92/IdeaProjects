package conditions;
import java.util.Scanner;

public class CardClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номинал карты (2-10, J, Q, K, A): ");
            String rank = scanner.nextLine();
            System.out.print("Введите масть карты (C, D, H, S): ");
            String suit = scanner.nextLine();

            System.out.println(classifyCard(rank, suit));
        }
    }

    static String classifyCard(String rank, String suit) {
        String result = "";
        //TODO: Определите название карты
        // Напишите программу, которая определяет полное название игральной карты
        // Номинал (rank): 2-10, J, Q, K, A
        // Масть (suit): C (Clubs), D (Diamonds), H (Hearts), S (Spades)
        // Например: A + S -> "Туз пик"
        // Для некорректных значений верните "Invalid card"
        return result;
    }
}
