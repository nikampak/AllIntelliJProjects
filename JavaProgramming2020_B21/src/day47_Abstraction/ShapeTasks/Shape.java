package day47_Abstraction.ShapeTasks;

public abstract class Shape {

    public String name;

    public Shape(String name){
        this.name = name;
    }
    public abstract double area();

    public abstract double perimeter();
}

//class Test {
//    public static void main(String[] args) {
//        Shape obj = new Shape("Shape") {
//            @Override
//            public double area() {
//                return 0;
//            }
//
//            @Override
//            public double perimeter() {
//                return 0;
//            }
//        }
//    }
//}
