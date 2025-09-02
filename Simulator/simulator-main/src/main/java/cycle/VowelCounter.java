package cycle;
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();

            System.out.println(countVowels(text));
        }
    }

    static String countVowels(String text) {
        String result = "";
        //TODO: Подсчитайте количество гласных букв в строке
        // Напишите программу, которая считает количество гласных букв в строке
        // Гласные буквы (независимо от регистра): a, e, i, o, u
        // Например, для строки "Hello" результат будет "2"
        // Для пустой строки верните "0"
        // Используйте цикл for для перебора символов
        // Подсказка: используйте метод toLowerCase() для приведения к нижнему регистру
        return result;
    }
}
