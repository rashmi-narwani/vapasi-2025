package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        Triangle triangle = new Triangle(30.0, 40.0, 50.0);

        Rectangle square = new Rectangle(0, 0);
        square.setDimensions(5.0); // Overloaded version for square
        rectangle.setDimensions(4.0, 2.0); // Rectangle version

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(square);

        System.out.println("---------------Calculations---------------");
        for (Shape shape : shapes) {
            System.out.println("Class: " + shape.getClass().getSimpleName());
            System.out.printf("Area: %.2f\n", shape.calculateArea());
            System.out.printf("Perimeter: %.2f\n\n", shape.calculatePerimeter());
        }
    }
}