package org.example;

// Rectangle is a shape with length and width.
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area = length * width
    @Override
    public double getArea() {
        return length * width;
    }

    // Perimeter = 2 * (length + width)
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
