package day07_UnaryOperators;

public class Kahoot {
    public static void main(String[] args) {
        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" + (1) + (2));
        System.out.println("Result B" + (1 + 2));

        System.out.println("====================");
        long a12 = 3_000L;
        double b12 = (float)a12;
        int c12 = (short)b12;

        System.out.println(c12);
        System.out.println("===================");

        double a = 10.0/3;
        System.out.println(a);
        System.out.println("============");


    }
}
