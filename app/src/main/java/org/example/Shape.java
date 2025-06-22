package org.example;

// Abstract class: can't create instances directly only subclasses can.
// It defines methods all shapes must implement.
public abstract class Shape {
    // Method to calculate area of shape.
    public abstract double getArea();

    // Method to get perimeter (or circumference) of shape.
    public abstract double getPerimeter();
}
