package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
  private static final double DELTA = 1e-6; // margin for floating point comparison

    // test Circle class
  @Test
  void testCircle() {
    Circle circle = new Circle(2.0);
    assertEquals(Math.PI * 4, circle.getArea(), DELTA); // Area = πr^2
    assertEquals(2 * Math.PI * 2.0, circle.getPerimeter(), DELTA); // Perimeter = 2πr
  }

  // test Rectangle class
  @Test
  void testRectangle() {
    Rectangle rect = new Rectangle(4.0, 5.0);
    assertEquals(20.0, rect.getArea(), DELTA); // Area = length * width
    assertEquals(18.0, rect.getPerimeter(), DELTA); // Perimeter = 2(l + w)
    assertEquals(4, rect.numberOfSides()); // Rectangle has 4 sides
  }

  // test RightTriangle class
  @Test
  void testRightTriangle() {
    RightTriangle rt = new RightTriangle(3.0, 4.0);
    assertEquals(6.0, rt.getArea(), DELTA); // Area = 0.5 * leg1 * leg2
    assertEquals(12.0, rt.getPerimeter(), DELTA); // Perimeter = sum of legs + hypotenuse (5)
    assertEquals(3, rt.numberOfSides()); // Triangle has 3 sides
  }

// test Square class
  @Test
  void testSquare() {
    Square square = new Square(5.0);
    assertEquals(25.0, square.getArea(), DELTA); // Area = side^2
    assertEquals(20.0, square.getPerimeter(), DELTA); // Perimeter = 4 * side
    assertEquals(4, square.numberOfSides()); // Square has 4 sides
  }

  // test IsocelesRightTriangle class
  @Test
  void testIsocelesRightTriangle() {
    IsocelesRightTriangle isoRt = new IsocelesRightTriangle(4.0);
    assertEquals(8.0, isoRt.getArea(), DELTA); // Area = 0.5 * leg * leg
    double hyp = 4 * Math.sqrt(2);
    assertEquals(8 + hyp, isoRt.getPerimeter(), DELTA); // Perimeter = 2 * leg + hypotenuse
    assertEquals(3, isoRt.numberOfSides()); // Triangle has 3 sides
  }
}
