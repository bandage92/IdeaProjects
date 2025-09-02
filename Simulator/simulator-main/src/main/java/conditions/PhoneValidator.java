package conditions;
import java.util.Scanner;

public class PhoneValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер телефона: ");
            String phone = scanner.nextLine();

            System.out.println(validatePhone(phone));
        }
    }

    static String validatePhone(String phone) {
        String result = "";
        //TODO: Проверьте формат номера телефона
        // Напишите программу, которая проверяет формат номера телефона:
        // - Если начинается с +7 и содержит 11 цифр: "Valid Russian number"
        // - Если начинается с 8 и содержит 11 цифр: "Valid Russian number"
        // - Если начинается с +1 и содержит 11 цифр: "Valid US number"
        // - В остальных случаях: "Invalid number"
        // Используйте методы String:
        // - startsWith() для проверки начала строки
        // - replaceAll("[^0-9]", "") для получения только цифр
        return result;
    }
}
