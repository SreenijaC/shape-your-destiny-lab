package org.example;

// Square is special rectangle with equal sides.
public class Square extends Rectangle {

    // constructor takes 1 side and sets both length & width equal.
    public Square(double side) {
        super(side, side);
    }

    // we inherit getArea(), getPerimeter() and numberOfsides from Rectangle - no
    // need to override.
}
