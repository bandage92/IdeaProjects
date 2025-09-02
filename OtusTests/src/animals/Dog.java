package animals;

public class Dog extends Animal{
    public Dog(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    // Переопределенный метод say
    @Override
    public void say() {
        System.out.println("Гав");
    }
}
