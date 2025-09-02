package cycle;
import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер доски: ");
            int size = scanner.nextInt();

            System.out.println(drawBoard(size));
        }
    }

    static String drawBoard(int size) {
        String result = "";
        //TODO: Нарисуйте шахматную доску
        // Напишите программу, которая рисует шахматную доску
        // Используйте символы # и . для черных и белых клеток
        // Размер доски задается параметром size (size x size)
        // Для size <= 0 верните "Invalid size"
        // Каждая строка должна заканчиваться переносом строки
        return result;
    }
}
