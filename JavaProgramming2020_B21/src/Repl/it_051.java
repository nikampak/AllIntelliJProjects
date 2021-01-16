package Repl;

import java.util.Scanner;

public class it_051 {
    public static void main(String[] args) {
        double checkAmount, tip = 0;
        int numberPeople;
        String split;

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        split = scan.next();

        System.out.println("Number of people:");
        numberPeople = scan.nextInt();

        System.out.println("Check amount:");
        checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String service = scan.next();

        scan.close();

        switch (service) {
            case "Poor":
                tip = checkAmount * 0.05;
                break;
            case "Fair":
                tip = checkAmount * 0.10;
                break;
            case "Good":
                tip = checkAmount * 0.15;
                break;
            case "Great":
                tip = checkAmount * 0.20;
                break;
            case "Excellent":
                tip = checkAmount * 0.25;
                break;
            default:
                break;
        }
        System.out.println("Number of people entered: "+ numberPeople);
        System.out.println("Total to pay: " + (checkAmount + tip) );
        System.out.println("Total tip: "+ tip);
        System.out.println("Total per person: " + ( (checkAmount + tip) / numberPeople) );
        System.out.println("Tip per person: " + (tip / numberPeople) );
    }
}
