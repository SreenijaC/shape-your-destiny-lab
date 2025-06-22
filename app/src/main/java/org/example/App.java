package org.example;

public class App {
    public static void main(String[] args) {
        // Create a few example shapes and print their area and perimeter

        // Circle with radius 3
        Circle circle = new Circle(3);
        System.out.println("Circle:");
        System.out.printf("Area = %.2f\n", circle.getArea());
        System.out.printf("Perimeter = %.2f\n", circle.getPerimeter());

        System.out.println();

        // Rectangle with length 4 and width 5
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle:");
        System.out.printf("Area = %.2f\n", rectangle.getArea());
        System.out.printf("Perimeter = %.2f\n", rectangle.getPerimeter());

        System.out.println();

        // Right triangle with legs 3 and 4
        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println("Right Triangle:");
        System.out.printf("Area = %.2f\n", triangle.getArea());
        System.out.printf("Perimeter = %.2f\n", triangle.getPerimeter());

        // Square with side 5
        Square square = new Square(5);
        System.out.println("Square:");
        System.out.printf("Area = %.2f\n", square.getArea());
        System.out.printf("Perimeter = %.2f\n", square.getPerimeter());
        System.out.println();

        // Isoceles right triangle with legs 4
        IsocelesRightTriangle isoTriangle = new IsocelesRightTriangle(4);
        System.out.println("Isoceles Right Triangle:");
        System.out.printf("Area = %.2f\n", isoTriangle.getArea());
        System.out.printf("Perimeter = %.2f\n", isoTriangle.getPerimeter());

    }
}
