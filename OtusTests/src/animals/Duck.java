package animals;

public class Duck extends Animal implements Flying{
    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    // Переопределенный метод say
    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}