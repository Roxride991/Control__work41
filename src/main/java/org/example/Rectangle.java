package org.example;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(String type_of_figure , double a , double b) {
        super(type_of_figure);
        this.a = a;
        this.b = b;
    }

    @Override
    public double squares() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }
}
