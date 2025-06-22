package org.example;

// Square is a special rectangle with equal sides.
public class Square extends Rectangle {

    // Constructor takes one side and sets both length & width equal.
    public Square(double side) {
        super(side, side);
    }

    // We inherit getArea(), getPerimeter() from Rectangle - no need to override.
}
