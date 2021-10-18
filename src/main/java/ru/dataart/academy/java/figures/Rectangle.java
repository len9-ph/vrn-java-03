package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    private final double a;
    private final double b;

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double square() {
        return a * b;
    }

    @Override
    protected double perimeter() {
        return (a + b) * 2;
    }
}
