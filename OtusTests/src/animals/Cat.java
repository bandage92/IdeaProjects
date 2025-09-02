package animals;

public class Cat extends Animal{
    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    // Переопределенный метод say
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
