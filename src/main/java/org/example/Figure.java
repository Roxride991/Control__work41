package org.example;

public abstract class Figure {
    private String type_of_figure;

    public Figure(String type_of_figure) {
        this.type_of_figure = type_of_figure;
    }

    public abstract double squares();
    public abstract double perimeter();

}