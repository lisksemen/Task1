package figures;

public class Square extends Figure {

    private final double a;

    public static Square createInstance(double a) {
        if (a >= 0)
            return new Square(a);
        throw new IllegalArgumentException("Square side length can not be less than 0");
    }

    private Square(double a) {
        this.a = a;
    }


    @Override
    public double getSquare() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + a +
                '}';
    }
}
