package animals;

import data.ColorData;

public abstract class AbsAnimal {

    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color = null;

    public AbsAnimal(String name,int age, int weight, ColorData color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public String toString() {
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s.", name, age, getAgeCase(), weight, color.getName());
    }

    private String getAgeCase() {
        int remainder = age % 10;

        if(age >= 11 && age <= 14) {
            return "лет";
        }
        if(remainder == 1) {
            return "год";
        }
        if(remainder >= 2 && remainder <= 4) {
            return "года";
        }
        return "лет";
    }
}