package org.example;

/*
 * IsocelesRightTriangle is  right triangle with equal legs.
 *   – inherits everything from RightTriangle; we just call the
 *     parent constructor with the same leg value twice.
 */
public class IsocelesRightTriangle extends RightTriangle {

    // Constructor takes one leg length and passes twice.
    public IsocelesRightTriangle(double leg) {
        super(leg, leg);
    }

    // getArea() and getPerimeter() and numberOfSides from RightTriangle are
    // correct,
    // because they use two equal legs passed in.
}
