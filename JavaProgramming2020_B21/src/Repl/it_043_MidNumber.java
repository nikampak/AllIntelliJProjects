package Repl;

import java.util.Scanner;

public class it_043_MidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();
        scan.close();
        int result = 0;
        if (num1 > num2 && num2 > num3 || num1 < num2 && num2 < num3) {
            result = num2;
        }else if (num1 > num3 && num3 > num2 || num1 < num3 && num3 < num2) {
            result = num3;
        }else{
            result = num1;
        }
        System.out.println("Medium value is: "+ result);


    }
}
