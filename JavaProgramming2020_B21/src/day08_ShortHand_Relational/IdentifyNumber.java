package day08_ShortHand_Relational;

public class IdentifyNumber {
    public static void main(String[] args) {
      int x = -100;
      boolean isPositive = x > 0; // is number is greater than zero than it's positive
        boolean isNegative = x < 0; // if number is less than zero than it's negative
        boolean isZero = x == 0; // if number is equal to zero than it's zero

        System.out.println(x + " is positive: " + isPositive); // false
        System.out.println(x + " is negative: " + isNegative); // true
        System.out.println(x + " is zero: " + isZero);         //false
    }
}
/*
number = 100

output:
    100 is positive number: true
    100 is negative number: false
    100 is zero: false
 */