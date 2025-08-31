package animals;

public class Animal {
    // Свойства: name, age, weight, color
    public String name;
    public int age;
    public double weight;
    public String color;

    // Конструктор
    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Методы getter and setter для каждого свойства
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод say
    public void say() {
        System.out.println("Я говорю");
    }

    // Метод go
    public void go() {
        System.out.println("Я иду");
    }

    // Метод drink
    public void drink() {
        System.out.println("Я пью");
    }

    // Метод eat
    public void eat() {
        System.out.println("Я ем");
    }

    // Переопределенный метод toString с правильным склонением лет/год/года v1
/*    @Override
    public String toString() {
        String ageWord;
        if (age % 10 == 1 && age % 100 != 11) {
            ageWord = "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age % 100 >= 12 && age % 100 <= 14)) {
            ageWord = "года";
        } else {
            ageWord = "лет";
        }

        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %.1f кг, мой цвет - %s.",
                name, age, ageWord, weight, color);
    }*/

    // Переопределенный метод toString с правильным склонением лет/год/года v2
    @Override
    public String toString() {
        String ageWord;
        if (age % 10 == 1 && age % 100 != 11) {
            ageWord = "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age % 100 >= 12 && age % 100 <= 14)) {
            ageWord = "года";
        } else {
            ageWord = "лет";
        }
        return "Привет! Меня зовут " + name +
                ", мне " + age + " " + ageWord +
                ", я вешу - " + weight + " кг" +
                ", мой цвет - " + color + ".";
    }

    // Примеры реализаци
    public static void main(String[] args) {
        Animal animal1 = new Animal("Тося", 12, 6.5, "рыжий");
        Animal animal2 = new Animal("Ларик", 1, 2.3, "белый");
        Animal animal3 = new Animal("Соня", 24, 4.8, "кремовый");
        Animal animal4 = new Animal("Локки", 2, 24.1, "шоколадный");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}