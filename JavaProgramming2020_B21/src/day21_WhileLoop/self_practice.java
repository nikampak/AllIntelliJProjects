package day21_WhileLoop;

import java.util.Scanner;

public class self_practice {
    public static void main(String[] args) {
//SumOfNumbers
//	1.  Write a program that calculates the sum of numbers entered by the user
//	until user enters a negative number.
//			hint: you need an infinite loop
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i > -1; ) {
            System.out.println("Enter numbers");
            int number = scan.nextInt();

            if (number < 0) {
                break;
            } else{
                sum += number;
            }

        }
        System.out.println("Sum is " + sum);
        System.out.println("============================");
//        FactorialNumber
//       2.  Write a program that can return the factorial number of any given number
//        Ex:
//        input: 5
//        output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


        System.out.println("Enter a number");
        double number = scan.nextDouble();
        double factor = 1;
scan.close();
        for (int i = (int) number; i >= 1; i--) {
            factor *= i;
        }
        System.out.println("Factorial number is " + factor);
//      1. print odd number between 1 to 50 (MUST use continue statement)
//      2. print even number between 1 to 50  (MUST use continue statement
//      3. print numbers between 1 to 50 that are evenly divisible by 3 (MUST use continue statement)
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
