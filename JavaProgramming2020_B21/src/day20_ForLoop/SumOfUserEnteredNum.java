package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();
        System.out.println("Enter a number");
        int n3 = scan.nextInt();
        System.out.println("Enter a number");
        int n4 = scan.nextInt();
        System.out.println("Enter a number");
        int n5 = scan.nextInt();

        int result1 = n1 + n2 + n3 + n4 + n5;
        System.out.println(result1);

         */


        int times = scan.nextInt(); // how many number user wants to enter
        int result = 0;
        for (int i = 1; i <= times; i++) {
            System.out.println("Enter a number ");
            result += scan.nextInt();

scan.close();
        }
        System.out.println("result = " + result);


    }
}
/*
3. write a program that can calculate the sum of 5 user entered input

 */