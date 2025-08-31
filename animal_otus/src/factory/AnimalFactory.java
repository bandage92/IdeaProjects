package factory;

import animals.AbsAnimal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypeData;
import data.ColorData;

public class AnimalFactory {

    public AbsAnimal create(AnimalTypeData animalTypeData, String name, int age, int weight, ColorData color) {
        return switch (animalTypeData) {
            case CAT -> new Cat(name, age, weight, color);
            case DOG -> new Dog(name, age, weight, color);
            case DUCK -> new Duck(name, age, weight, color);
        };
    }
}