package day44_Inheritance.ShapesTask;

public class Square extends Shape{
        /*
    vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
    methods: setInfo, calcArea(), calcPerimeter(), toString()
     */
    public double side;

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
