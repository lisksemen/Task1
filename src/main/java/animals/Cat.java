package animals;

public class Cat extends Animal implements Walkable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }
}
