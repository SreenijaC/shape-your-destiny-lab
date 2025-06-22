package org.example;

public class Rectangle extends Shape implements Polygon{
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
     // Rectangle has 4 sides
    @Override
    public int numberOfSides() {
        return 4;
    }
}
