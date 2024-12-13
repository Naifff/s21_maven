package com.geometry.shapes;

public class Rhombus implements Shape {
    private final double diagonal1;
    private final double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * Math.sqrt(diagonal1 * diagonal1 / 4 + diagonal2 * diagonal2 / 4);
    }
}
