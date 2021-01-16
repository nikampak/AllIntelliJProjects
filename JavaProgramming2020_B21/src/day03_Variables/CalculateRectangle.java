package day03_Variables;

public class CalculateRectangle {
    public static void main(String[] args) {
// width: 5, length: 20
        int width = 5;
        int length = 20;
        int area = width * length;
// 5 * 20
        System.out.println("Area is:");
        System.out.println(width*length);
        System.out.println(area);

        System.out.println();
        System.out.print("Area is: ");
        System.out.print(area);
        System.out.println("\n============================");

        int perimeter = width + length;
        System.out.print("Perimeter is: ");
        System.out.print(perimeter);



    }
}

/*
declare variables:
    DataType name = Data
    Example:
    int area = width * length;
 */