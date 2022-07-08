package figures;

import java.util.Arrays;

public class Triangle extends Figure {

    private final double[] edges;

    public static Triangle getInstance(double... edges) {
        if (edges.length != 3)
            throw new IllegalArgumentException("Triangle can have only three edges");
        if (!isTriangle(edges))
            throw new IllegalArgumentException("Edges length is not correct");

        return new Triangle(edges);
    }


    private Triangle(double[] edges) {
        this.edges = edges;
    }

    @Override
    public double getSquare() {
        double a = edges[0];
        double b = edges[1];
        double c = edges[2];
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return edges[0] + edges[1] + edges[2];
    }

    /**
     * Checks edges length to be correct
     * @param edges array of edges
     * @return bool
     */
    private static boolean isTriangle(double[] edges) {
        double a = edges[0];
        double b = edges[1];
        double c = edges[2];

        return (a < b + c) && (b < a + c) && (c < a + b) &&
                (a > 0) && (b > 0) && (c > 0);
    }

    @Override
    public String toString() {
        return "Triangle" + Arrays.toString(edges);
    }
}
