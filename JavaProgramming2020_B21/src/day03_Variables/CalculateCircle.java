package day03_Variables;

import java.sql.SQLOutput;

public class CalculateCircle {
    public static void main(String[] args) {
        double radius = 4.5;
        double PI = 3.14;

        double area = radius * radius * PI;
        double perimeter = radius * PI;

        System.out.print("Area of the Circle: is ");
        System.out.print(area);

        System.out.print("\nPerimeter of the Circle: is ");
        System.out.print(perimeter);
    }
}
