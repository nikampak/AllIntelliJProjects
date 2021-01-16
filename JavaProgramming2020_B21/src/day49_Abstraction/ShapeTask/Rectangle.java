package day49_Abstraction.ShapeTask;

public final class Rectangle extends Shape{
    public double w, l;

    public Rectangle(double w, double l) {
        super("Rectangle");
  //
        this.w = w;
        this.l = l;
    }


    public double area() {
        return 0;
    }


    public double perimeter() {
        return 0;
    }
}
