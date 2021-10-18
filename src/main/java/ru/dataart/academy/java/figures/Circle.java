package ru.dataart.academy.java.figures;
import static java.lang.Math.PI;

public class Circle extends Figure {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    protected double square() {
        return PI * r * r;
    }

    @Override
    protected double perimeter() {
        return 2 * PI * r;
    }
}
