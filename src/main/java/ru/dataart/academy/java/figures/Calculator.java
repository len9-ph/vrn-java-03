package ru.dataart.academy.java.figures;

public class Calculator {

    public double getSumOfSquares(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].square();
        }
        return sum;
    }
}
