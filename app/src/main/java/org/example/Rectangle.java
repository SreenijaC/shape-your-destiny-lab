package org.example;

/*
 * rectangle is special type of parallelogram where all angles are 90 degrees.
 * or rectangles, h equals the w because h is perpendicular to base.
 * rectangle extends Parallelogram and implements Polygon via inheritance.
 */
public class Rectangle extends Parallelogram {
    // constructor initializing l and w by passing l, w to parallelogram constructor
    public Rectangle(double length, double width) {
        // base = l, side = w, h = w (h is perpendicular to base)
        super(length, width, width);
    }

    /*
     * A = base * h, inherited from Parallelogram.
     */
    @Override
    public double getArea() {
        return base * height; // same as length * width
    }

    /**
     * Perimeter = 2 * (base + side), inherited from Parallelogram.
     */
}
