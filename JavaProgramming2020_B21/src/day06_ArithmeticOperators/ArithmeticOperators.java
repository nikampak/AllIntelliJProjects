package day06_ArithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10/4); //2
        System.out.println("10/4"); // text
        System.out.println(12+3); // 15
        System.out.println("12"+3); // concatenation 123
        System.out.println('a' +3); // addition, every single char has a corresponding number asciitable a=97
        // 97 + 3 =100
        System.out.println(12.0 - 4); // 8.0

        double a = 12.0/3; // decimal divided by integer is equal decimal (double, NOT Int)
        System.out.println(a);

        int b= 10/3; // int/int is int
                    // b = 3
        System.out.println(b);

        double c= 10/3; // int divided by int (int/int) is int
                        // c = 3
        System.out.println(c);

        double d = 10.0/3;
        System.out.println(d); // double divided by int is double (double/int)
                                // d = 3.33333
        int x = 3/12; // int/int is int
                        // x = 0
        System.out.println(x);

        double y = 3/2; // int/int is int
                        // = 1
        System.out.println(y);

        double z = 3f/2;    // "F" is float, float represents a decimal number; decimal/int is decimal (double)
                            // z = 1.5
        System.out.println(z);

        System.out.println("=================================================");

        System.out.println(100%13); // remainder is 9
        System.out.println(100%10); // remainder is 0 (100 is divided easily by 10, no decimals) that's why it's 0
        System.out.println(10%3); //remainder 1
        System.out.println(20%6); // remainder 2
        System.out.println(100%20); // remainder 0





    }
}
