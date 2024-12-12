package com.geometry.app;

import com.geometry.shapes.*;

public class Main {
	public static void main(String[] args) {
		// Создаем различные фигуры
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);
		Triangle triangle = new Triangle(3, 4, 5);

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
	}
}