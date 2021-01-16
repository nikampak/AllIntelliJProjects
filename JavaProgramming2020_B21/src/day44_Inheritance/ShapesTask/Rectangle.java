package day44_Inheritance.ShapesTask;

public class Rectangle extends Shape{

    /*
    vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
    methods: setInfo, calcArea(), calcPerimeter(), toString()
     */

    public double  width, length;

    public Rectangle(double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;



    }

    public double calcArea(){
        return width * length;
    }

}
