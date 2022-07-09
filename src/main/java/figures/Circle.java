package figures;

public class Circle extends Figure{

    private final double radius;

    public static Circle createInstance(double radius) {
        if (radius >= 0)
            return new Circle(radius);
        throw new IllegalArgumentException("Radius can not be less than 0");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    /**
     * In this case calculates circle length
     * @return circle length
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
