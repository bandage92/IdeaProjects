import animals.AbsAnimal;
import data.AnimalTypeData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalActionFactory;
import factory.AnimalFactory;
import tools.NumbersTools;
import tools.StringsTools;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static <T extends Enum<T>> List<String> getEnumNames(Class<T> enumClass, Function<T, String> enumNameMapper) {
        List<String> names = new ArrayList<>();
        for(T enumValue : enumClass.getEnumConstants()) {
            names.add(enumNameMapper.apply(enumValue));
        }
        return names;
    }

    public static void main(String[] args) {
        List<AbsAnimal> animals = new ArrayList<>();
        AnimalActionFactory animalActionFactory = new AnimalActionFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем Вас в нашей программе 'Животные'!");

        while(true) {
            System.out.printf("Введите одну из команд: %s\n", String.join("/", getEnumNames(CommandsData.class, e -> e.name().toLowerCase())));
            String input = scanner.nextLine().trim();
            CommandsData command = CommandsData.parse(input);

            if(command == null) {
                System.out.println("Ошибка! Вы ввели неверную команду. Попробуйте ещё раз.");
                continue;
            }

            switch(command) {
                case ADD:
                    // Вид животного
                    String animalTypeInput;
                    while(true) {
                        System.out.printf("Введите вид животного: %s\n", String.join("/", getEnumNames(AnimalTypeData.class, e -> e.name().toLowerCase())));
                        animalTypeInput = scanner.nextLine().toUpperCase().trim();

                        if(AnimalTypeData.isAnimalTypeExist(animalTypeInput)) {
                            break;
                        }
                        System.out.println("Ошибка! Вы ввели неверный вид животного. Попробуйте ещё раз.");
                    }

                    AnimalTypeData animalType = AnimalTypeData.valueOf(animalTypeInput);

                    // Имя
                    String nameInput;
                    while(true) {
                        System.out.print("Введите имя животного: \n");
                        nameInput = scanner.nextLine().trim();

                        if(StringsTools.isValidName(nameInput)) {
                            break;
                        } else {
                            String errorMessage = StringsTools.getNameErrorMessage(nameInput);
                            System.out.println("Ошибка! " + errorMessage);
                        }
                    }

                    // Возраст
                    String ageInput;
                    while(true) {
                        System.out.print("Введите возраст животного: \n");
                        ageInput = scanner.nextLine().trim();

                        if(NumbersTools.isNumber(ageInput)) {
                            break;
                        } else {
                            System.out.println("Ошибка! Введите возраст от 1 года до 500 лет");
                        }
                    }

                    // Вес
                    String weightInput;
                    while(true) {
                        System.out.print("Введите вес животного: \n");
                        weightInput = scanner.nextLine().trim();

                        if(NumbersTools.isNumber(weightInput)) {
                            break;
                        } else {
                            System.out.println("Ошибка! Введите вес от 1 кг до 500 кг");
                        }
                    }

                    // Цвет
                    ColorData color = null;
                    while(color == null) {
                        System.out.printf("Введите цвет животного. Доступные цвета: %s.\n", String.join(", ", getEnumNames(ColorData.class, ColorData::getName)));
                        String colorInput = scanner.nextLine().trim();

                        color = ColorData.getRussianColor(colorInput);

                        if(color == null) {
                            System.out.println("Ошибка! Вы ввели неверный цвет животного. Попробуйте ещё раз.");
                        }
                    }
                    
                    AnimalFactory animalFactory = new AnimalFactory();
                    AbsAnimal factoryAnimal = animalFactory.create(
                            animalType,
                            nameInput,
                            Integer.parseInt(ageInput),
                            Integer.parseInt(weightInput),
                            color);

                    animals.add(factoryAnimal);
                    System.out.print("Животное добавлено! \n");
                    factoryAnimal.say();
                    animalActionFactory.specialAnimalActions(factoryAnimal);
                    break;

                case LIST:
                    System.out.println("\n--- Список всех животных ---");
                    for(AbsAnimal animal : animals) {
                        System.out.println(animal.toString());
                    }

                    if(animals.isEmpty()) {
                        System.out.println("Животных нет в списке.");
                    }
                    break;

                case EXIT:
                    System.out.println("Вы вышли из программы. До скорой встречи!");
                    System.exit(0);
            }
        }
    }
}