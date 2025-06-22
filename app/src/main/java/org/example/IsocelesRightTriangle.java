package org.example;

/*
 * IsocelesRightTriangle is a right triangle with equal legs.
 *   – Inherits everything from RightTriangle; we just call the
 *     parent constructor with the same leg value twice.
 */
public class IsocelesRightTriangle extends RightTriangle {

    // Constructor takes one leg length and passes it twice.
    public IsocelesRightTriangle(double leg) {
        super(leg, leg);
    }

    // getArea() and getPerimeter() from RightTriangle are correct,
    // because they use the two equal legs we passed in.
}
