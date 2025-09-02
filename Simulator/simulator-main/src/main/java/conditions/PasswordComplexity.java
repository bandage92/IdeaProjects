package conditions;
import java.util.Scanner;

public class PasswordComplexity {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            System.out.println(evaluatePassword(password));
        }
    }

    static String evaluatePassword(String password) {
        String result = "";
        //TODO: Оцените сложность пароля
        // Напишите программу, которая оценивает сложность пароля
        // Критерии:
        // - Длина >= 8 символов: +1 балл
        // - Содержит цифры: +1 балл
        // - Содержит строчные буквы: +1 балл
        // - Содержит заглавные буквы: +1 балл
        // - Содержит специальные символы (!@#$%^&*): +1 балл
        // Оценка:
        // - 0-1 балл: "Weak password"
        // - 2-3 балла: "Medium password"
        // - 4-5 баллов: "Strong password"
        // Для пустого пароля верните "Invalid password"
        return result;
    }
}
