package org.example;

public class Square extends Figure{
    private double a;

    public Square(String type_of_figure, double a) {
        super(type_of_figure);
        this.a = a;
    }

    @Override
    public double squares() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    public double diagonal() {
        return Math.sqrt(a * a + a * a);
    }
}

