
package org.example;

/*
 * Parallelogram
 *  – a four-sided shape (quadrilateral) whose opposite sides are
 *    both parallel AND equal in length.
 *  – area      = base × height         (height perpendicular base)
 *  – perimeter = 2 × (base + side)    (side is slanted edge length)
 *
 * this class extends Shape and implements Polygon because a parallelogram  shape and is also four-sided polygon.
 */
public class Parallelogram extends Shape implements Polygon {

    // Using protected so rectangle reuse them directly.
    protected double base;   // one pair of || sides
    protected double side;   // the other pair of || sides
    protected double height; // perpendiculare distance between  bases

    /* constructor sets base, side, and perpendicular height. */
    public Parallelogram(double base, double side, double height) {
        this.base   = base;
        this.side   = side;
        this.height = height;
    }

    /** area formula for parallelogram: base × height. */
    @Override
    public double getArea() {
        return base * height;
    }

    /** Perimeter = 2 × (base + side). */
    @Override
    public double getPerimeter() {
        return 2 * (base + side);
    }

    /** parallelogram has 4 sides. */
    @Override
    public int numberOfSides() {
        return 4;
    }
}

