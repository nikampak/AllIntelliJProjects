package day21_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        scan.close();

        int result = 1;

        for (int i = (int)num; i >= 1; i--){
            result *= i;
        }


    }
}
/*
 Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */