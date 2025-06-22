package org.example;

// abstract class: can't create instances directly only subclasses can.
// it defines methods all shapes must implement.
public abstract class Shape {
    // method to calculate area of shape.
    public abstract double getArea();

    // method to get perimeter (or circumference) of shape.
    public abstract double getPerimeter();
}
