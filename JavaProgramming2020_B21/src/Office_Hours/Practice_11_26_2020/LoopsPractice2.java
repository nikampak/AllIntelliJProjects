package Office_Hours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopsPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlyRate = 0;
        int weeklyHour = 0;
        String answer = "";


    do {
        System.out.println("enter your hourlyRate");
        hourlyRate = scan.nextDouble();
        System.out.println("How many hours do you work in a week?");
        weeklyHour = scan.nextInt();

        double salary = weeklyHour * hourlyRate * 52;
        System.out.println("Your salary: " + salary);
        double tax = salary * 0.3;
        System.out.println("Your tax: " + tax);
        double salaryAfterTax = salary - tax;
        System.out.println("Your salary after tax: " + salaryAfterTax);

        System.out.println("Would you like to continue");
        answer = scan.next().toLowerCase();
scan.close();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Would you like to continue?");
        }
    }while (answer.equalsIgnoreCase("yes"));



    }
}
