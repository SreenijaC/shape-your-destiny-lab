package org.example;

public class App {
    public static void main(String[] args) {

        // circle - radius 3
        Circle circle = new Circle(3);
        System.out.println("Circle:");
        System.out.println("radius = 3");
        System.out.printf("Area = %.2f\n", circle.getArea());
        System.out.printf("Perimeter = %.2f\n", circle.getPerimeter());
        System.out.println("Number of sides = N/A (it is not a polygon)");
        System.out.println();

        // rectangle - length 4 and width 5
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle:");
        System.out.println("length = 4, width = 5");

        System.out.printf("Area = %.2f\n", rectangle.getArea());
        System.out.printf("Perimeter = %.2f\n", rectangle.getPerimeter());
        // Check if it implements Polygon to print sides
        if (rectangle instanceof Polygon) {
            Polygon poly = (Polygon) rectangle;
            System.out.println("Number of sides = " + poly.numberOfSides());
        }
        System.out.println();

        // right triangle - legs 3 and 4
        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println("Right Triangle:");
        System.out.println("leg1 = 3, leg2 = 4");

        System.out.printf("Area = %.2f\n", triangle.getArea());
        System.out.printf("Perimeter = %.2f\n", triangle.getPerimeter());
        if (triangle instanceof Polygon) {
            Polygon poly = (Polygon) triangle;
            System.out.println("Number of sides = " + poly.numberOfSides());
        }
        System.out.println();

        // square - side 5
        Square square = new Square(5);
        System.out.println("Square:");
        System.out.println("side = 5");
        System.out.printf("Area = %.2f\n", square.getArea());
        System.out.printf("Perimeter = %.2f\n", square.getPerimeter());
        if (square instanceof Polygon) {
            Polygon poly = (Polygon) square;
            System.out.println("Number of sides = " + poly.numberOfSides());
        }
        System.out.println();

        // isoceles right triangle - legs 4
        IsocelesRightTriangle isoTriangle = new IsocelesRightTriangle(4);
        System.out.println("Isoceles Right Triangle:");
        System.out.println("leg = 4");
        System.out.printf("Area = %.2f\n", isoTriangle.getArea());
        System.out.printf("Perimeter = %.2f\n", isoTriangle.getPerimeter());
        if (isoTriangle instanceof Polygon) {
            Polygon poly = (Polygon) isoTriangle;
            System.out.println("Number of sides = " + poly.numberOfSides());
        }
        System.out.println();
    }
}
