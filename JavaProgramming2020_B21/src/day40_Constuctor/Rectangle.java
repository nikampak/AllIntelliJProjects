package day40_Constuctor;

public class Rectangle {

    public static int numberOfSides;
    public double width, length, area, perimeter;

    static{
        numberOfSides = 4;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = width * length;
        perimeter = (width+length)*2;
    }

}
