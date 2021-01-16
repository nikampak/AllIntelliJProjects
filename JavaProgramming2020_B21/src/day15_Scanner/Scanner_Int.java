package day15_Scanner;

import java.util.Scanner;
// import day14_Switch_Recap.SalaryCalculator;
// If we wanted to Use the SalaryCalculator class in this class, we import

public class Scanner_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt(); // reading an int number
        // int numOne = 9000; -> Hard coding/fixed value

        scanner.close();

        System.out.println("Enter number two: ");
        int numTwo = scanner.nextInt(); // reading an int number

        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum "+ (numOne+numTwo));





    }
}
