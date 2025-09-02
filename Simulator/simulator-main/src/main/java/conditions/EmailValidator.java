package conditions;
import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите email: ");
            String email = scanner.nextLine();

            System.out.println(validateEmail(email));
        }
    }

    static String validateEmail(String email) {
        String result = "";
        //TODO: Проверьте корректность email адреса
        // Напишите программу, которая проверяет корректность email адреса
        // Требования к email:
        // - содержит только буквы, цифры, точки и @
        // - содержит ровно один символ @
        // - до @ минимум 1 символ
        // - после @ минимум 3 символа и точка
        // - после последней точки минимум 2 символа
        // Для корректного email верните "Valid email"
        // Для некорректного email верните "Invalid email"
        return result;
    }
}
