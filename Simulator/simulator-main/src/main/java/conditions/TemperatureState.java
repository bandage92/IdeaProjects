package conditions;
import java.util.Scanner;

public class TemperatureState {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите температуру воды в градусах Цельсия: ");
            double temperature = scanner.nextDouble();

            System.out.println(determineState(temperature));
        }
    }

    static String determineState(double temperature) {
        String result = "";
        //TODO: Определите состояние воды
        // Напишите программу, которая определяет состояние воды
        // при заданной температуре (в градусах Цельсия):
        // < 0: "Solid" (лёд)
        // 0-100: "Liquid" (жидкость)
        // > 100: "Gas" (пар)
        return result;
    }
}
