package conditions;
import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            System.out.println(checkPasswordStrength(password));
        }
    }

    static String checkPasswordStrength(String password) {
        String result = "";
        //TODO: Определите сложность пароля
        // Напишите программу, которая определяет сложность пароля:
        // - Если длина меньше 8 символов: "Weak"
        // - Если длина 8+ символов и есть только буквы ИЛИ только цифры: "Medium"
        // - Если длина 8+ символов и есть и буквы, и цифры: "Strong"
        // Используйте условные операторы if для решения
        // Подсказка: используйте методы String:
        // - length() для длины
        // - matches(".*[a-zA-Z].*") для проверки наличия букв
        // - matches(".*[0-9].*") для проверки наличия цифр
        return result;
    }
}
