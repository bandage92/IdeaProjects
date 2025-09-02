package conditions;
import java.util.Scanner;

public class CharacterClassifier {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите символ: ");
            char ch = scanner.next().charAt(0);

            System.out.println(classifyCharacter(ch));
        }
    }

    static String classifyCharacter(char ch) {
        String result = "";
        //TODO: Определите тип символа
        // Напишите программу, которая определяет тип символа
        // Возможные типы:
        // - "Uppercase letter" - заглавная буква (A-Z)
        // - "Lowercase letter" - строчная буква (a-z)
        // - "Digit" - цифра (0-9)
        // - "Special character" - специальный символ (все остальные)
        // Подсказка: используйте методы Character.isUpperCase(),
        // Character.isLowerCase(), Character.isDigit()
        return result;
    }
}
