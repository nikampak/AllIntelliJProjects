package Repl;

public class Carpet {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet() {
        this.width = 200;
        this.length = 200;
        this.unitPrice = 0;
        this.totalPrice = 200;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = (isPersian == true) ? totalPrice = (width + length) * unitPrice + 200 : (width + length) * unitPrice;
    }
//      WORKS what's the issue Repl 226
//    public static void main(String[] args) {
//        Carpet c = new Carpet();
//        System.out.println(c.totalPrice);
//
//        Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
//        System.out.println(c2.totalPrice);
//
//        Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
//        System.out.println(c3.totalPrice);
//    }
}
