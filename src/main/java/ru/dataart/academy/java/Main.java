package ru.dataart.academy.java;
import ru.dataart.academy.java.figures.*;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");

        Figure [] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(1,5);
        figures[2] = new Rectangle(10);

        Calculator calculator = new Calculator();
        System.out.println(calculator.getSumOfSquares(figures));
    }


}