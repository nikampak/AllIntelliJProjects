package day20_ForLoop;

import java.util.Scanner;

public class selfPractice {
    public static void main(String[] args) {
//      2. Write a program that will print out all alphabet letters in backwards
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
//      3. write a program that can calculate the sum of 5 user entered inputs
      Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to enter numbers?");
        int times = scan.nextInt();
        int count = 0;

        for (int i = 0; i < times; i++) {
            System.out.println("Enter number");
            count += scan.nextInt();
        }
        System.out.println("Result "+ count);
        //4. write a program that can calculate the sum of all numbers between 1 to any given number
        //	        ex:
        //	            input: 100
        //	            output: 5050
        //
        //	            input: 50
        //	            output: 1275
        int number = scan.nextInt();
 scan.close();

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum+= i;
        }
        System.out.println("Result " + sum);
    }
}
