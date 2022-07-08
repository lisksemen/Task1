package animals;

public class Parrot extends Animal implements Flyable {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Squawk");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
