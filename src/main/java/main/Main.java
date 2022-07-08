package main;

import animals.*;
import figures.Circle;
import figures.Figure;
import figures.Square;
import figures.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(Triangle.getInstance(3,4,5));
        figures.add(Circle.getInstance(3));
        figures.add(Square.getInstance(2));

        for (Figure figure : figures) {
            System.out.println(figure + ": square = " + figure.getSquare() + ", perimeter = " + figure.getPerimeter());
        }
    }

    private void run1() {
        ArrayList<Walkable> animals = new ArrayList<>();
        animals.add(new Dog("Bob"));
        animals.add(new Cat("Tom"));
        animals.add(new Duck("Jack"));

        for (Walkable animal : animals) {
            animal.walk();
        }
        System.out.println();

        ArrayList<Flyable> animals1 = new ArrayList<>();
        animals1.add(new Parrot("Sam"));
        animals1.add(new Duck("Jack"));

        for (Flyable flyable : animals1) {
            flyable.fly();
        }
    }
}
