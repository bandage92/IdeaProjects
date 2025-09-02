package conditions;
import java.util.Scanner;

public class IPAddressValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите IP адрес: ");
            String ip = scanner.nextLine();

            System.out.println(validateIP(ip));
        }
    }

    static String validateIP(String ip) {
        String result = "";
        //TODO: Проверьте корректность IP адреса
        // Напишите программу, которая проверяет корректность IP адреса
        // IP адрес должен:
        // - состоять из 4 чисел, разделенных точками
        // - каждое число должно быть в диапазоне от 0 до 255
        // Для корректного IP адреса верните "Valid IP"
        // Для некорректного IP адреса верните "Invalid IP"
        return result;
    }
}
