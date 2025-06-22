package org.example;

// Circle is a shape with radius, area = πr^2, perimeter = 2πr.
public class Circle extends Shape {
    private double radius;  

    // Constructor initializing radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate area of circle: π * r * r
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter (circumference): 2 * π * r
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
