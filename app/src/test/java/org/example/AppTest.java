package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
  private static final double DELTA = 1e-6; // margin for floating point comparison

  @Test
  void testCircle() {
    Circle circle = new Circle(2.0);
    assertEquals(Math.PI * 4, circle.getArea(), DELTA);
    assertEquals(2 * Math.PI * 2.0, circle.getPerimeter(), DELTA);
  }

  @Test
  void testRectangle() {
    Rectangle rect = new Rectangle(3.0, 4.0);
    assertEquals(12.0, rect.getArea(), DELTA);
    assertEquals(14.0, rect.getPerimeter(), DELTA);
  }

  @Test
  void testRightTriangle() {
    RightTriangle rt = new RightTriangle(3.0, 4.0);
    assertEquals(6.0, rt.getArea(), DELTA);
    assertEquals(12.0, rt.getPerimeter(), DELTA); // 3 + 4 + 5
  }

  // Test Square class
  @Test
  void testSquare() {
    Square square = new Square(5.0);
    assertEquals(25.0, square.getArea(), DELTA); // Area = side^2
    assertEquals(20.0, square.getPerimeter(), DELTA); // Perimeter = 4 * side
  }

  @Test
  void testIsocelesRightTriangle() {
    IsocelesRightTriangle iso = new IsocelesRightTriangle(4);
    assertEquals(8, iso.getArea(), DELTA); // ½ × 4 × 4
    double hyp = 4 * Math.sqrt(2);
    assertEquals(8 + hyp, iso.getPerimeter(), DELTA); // 4 + 4 + hyp
  }
}
