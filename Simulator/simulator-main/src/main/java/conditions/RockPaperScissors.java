package conditions;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Игрок 1, введите свой выбор (rock/paper/scissors): ");
            String player1 = scanner.nextLine().toLowerCase();
            System.out.print("Игрок 2, введите свой выбор (rock/paper/scissors): ");
            String player2 = scanner.nextLine().toLowerCase();

            System.out.println(determineWinner(player1, player2));
        }
    }

    static String determineWinner(String player1, String player2) {
        String result = "";
        //TODO: Определите победителя в игре "Камень, ножницы, бумага"
        // Напишите программу, которая определяет победителя:
        // - "Player 1 wins" - если победил первый игрок
        // - "Player 2 wins" - если победил второй игрок
        // - "Draw" - если ничья
        // - "Invalid input" - если введены некорректные значения
        // Правила:
        // - rock бьет scissors
        // - scissors бьет paper
        // - paper бьет rock
        // Используйте условные операторы if для решения
        return result;
    }
}
