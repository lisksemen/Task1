package animals;

public class Duck extends Animal implements Walkable, Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking...");
    }
}
