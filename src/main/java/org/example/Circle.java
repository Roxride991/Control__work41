package org.example;

public class Circle extends Figure{
private double r;

    public Circle(String type_of_figure ,double r) {
        super(type_of_figure);
        this.r = r;
    }

    @Override
    public double squares() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

