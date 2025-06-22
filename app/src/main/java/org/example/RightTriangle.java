package org.example;

// rightTriangle is  polygon and shape with 2 legs at right angle.
public class RightTriangle extends Shape implements Polygon {
    protected double leg1; // first leg length
    protected double leg2; // second leg length

    // constructor initializes 2 legs.
    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    // Area = 1/2 * leg1 * leg2
    @Override
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }

    // perimeter = leg1 + leg2 + hypotenuse
    // hypotenuse = sqrt(leg1^2 + leg2^2) by Pythagorean theorem.
    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        return leg1 + leg2 + hypotenuse;
    }

    // num of sides in triangle is 3.
    @Override
    public int numberOfSides() {
        return 3;
    }
}