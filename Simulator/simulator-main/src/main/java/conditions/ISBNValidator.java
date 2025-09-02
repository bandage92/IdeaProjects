package conditions;
import java.util.Scanner;

public class ISBNValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ISBN (10 цифр): ");
            String isbn = scanner.nextLine();

            System.out.println(validateISBN(isbn));
        }
    }

    static String validateISBN(String isbn) {
        String result = "";
        //TODO: Проверьте корректность ISBN
        // Напишите программу, которая проверяет корректность ISBN-10
        // ISBN состоит из 10 цифр, где последняя цифра - контрольная сумма
        // Формула проверки: (d1*1 + d2*2 + d3*3 + ... + d9*9) % 11 = d10
        // Для корректного ISBN верните "Valid ISBN"
        // Для некорректного ISBN верните "Invalid ISBN"
        return result;
    }
}
