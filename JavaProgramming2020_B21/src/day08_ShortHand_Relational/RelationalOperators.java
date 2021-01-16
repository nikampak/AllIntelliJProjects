package day08_ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1 = 1000;
        int num2 = 20000;

        boolean r1 = num1 > num2;
        boolean r2 = num2 > num1;

        boolean r3 = num1 < num2;
        boolean r4 = num2 < num1;

        System.out.println(num1 + " is less than " + num2+": "+ r3); // 10 is less than 20: true
        System.out.println(num2 + " is less than " + num1+": "+ r4); // 20 is less than 10: false

        System.out.println(num1 + " is greater than " + num2+": "+ r1); // 10 is greater than 20: false
        System.out.println(num2 + " is greater than " + num1+": "+ r2); // 20 is greater than 10: true

        int x = 100;
        boolean isEven = x %2 == 0; // 100 is evenly divisible by 2
        // Even number is a number divisible by 2 without remainders

        boolean isOdd = x %2 != 0; // opposite of even



    }
}
