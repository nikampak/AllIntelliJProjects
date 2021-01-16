package day44_Inheritance.ShapesTask;

public class Circle extends Shape{

    /*
    variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
    methods: setInfo, calcArea(), calcPerimeter(), toString()
     */

    public double radius, diameter;
    public final static double PI;

    static {
        PI = 3.14;
    }

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
        diameter = this.radius * 2;
    }

    @Override
    public double calcArea(){
        return radius * radius * PI;
    }
    public double calcPerimeter() {
        return diameter * PI;
    }
}
