package day16_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1");
        double num1 = input.nextDouble();

        input.close();

        System.out.println("Enter number 2");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();

        input.close();// Closing the Scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:

                isValid = false;

        }
        if(isValid){
            System.out.println("Output: "+ result);
        }else{
            System.out.println(operator + " is an invalid result");
        }

    }
}
