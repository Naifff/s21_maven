package com.geometry.app;

import com.geometry.shapes.*;
import com.geometry.shapes3d.Cube;
import com.geometry.utils.ShapeComparator;

public class Main {
    public static void main(String[] args) {
        // Создаем различные фигуры
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        Rhombus rhombus = new Rhombus(6, 8);
        Cube cube = new Cube(3);

        // Выводим информацию о фигурах
        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());

        System.out.println("\nTriangle:");
        System.out.printf("Area: %.2f%n", triangle.getArea());
        System.out.printf("Perimeter: %.2f%n", triangle.getPerimeter());

        System.out.println("\nRhombus:");
        System.out.printf("Area: %.2f%n", rhombus.getArea());
        System.out.printf("Perimeter: %.2f%n", rhombus.getPerimeter());

        System.out.println("\nShapeComparator");
        System.out.printf("Area: triangle:rhombus %d%n", ShapeComparator.compareByArea(triangle,rhombus));
        System.out.printf("Perimeter: triangle:rhombus %d%n", ShapeComparator.compareByPerimeter(triangle,rhombus));

        System.out.println("\nCube:");
        System.out.printf("Volume: %.2f%n", cube.getVolume());
        System.out.printf("SurfaceArea: %.2f%n", cube.getSurfaceArea());
    }
}