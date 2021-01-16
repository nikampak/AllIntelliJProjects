package day06_ArithmeticOperators;

public class LiraToDollar {
    public static void main(String[] args) {
        int lira = 1000;
        double dollar = lira * 0.13;
        double euro = lira * 0.16097;

        System.out.println(lira + " Lira is equal to "+dollar);
        System.out.println(lira + " Lira is equal to "+euro);
    }
}

/*
Lira = 1000;
            output:
                1000 Lira is equal to 160.97 USD
            Lira = 1000000;
            output:
                1000000 Lira equal to 160969.70 USD

 */