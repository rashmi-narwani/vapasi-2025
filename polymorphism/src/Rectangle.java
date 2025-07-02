package src;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overloaded methods
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setDimensions(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
