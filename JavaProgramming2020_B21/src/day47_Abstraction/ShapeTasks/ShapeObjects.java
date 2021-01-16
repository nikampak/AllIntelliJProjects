package day47_Abstraction.ShapeTasks;

import day44_Inheritance.ShapesTask.Square;

public class ShapeObjects {
    public static void main(String[] args) {

        // Shape shape = new Shape("Shape");
        Circle circle = new Circle(3.5);
        System.out.println("Area of circle "+circle.area());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Area of rectangle "+rectangle.area());

        Square square = new Square(5);
        System.out.println( "Area of square "+square.calcArea() );

    }
}
