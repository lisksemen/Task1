package animals;

public class Dog extends Animal implements Walkable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }
}
