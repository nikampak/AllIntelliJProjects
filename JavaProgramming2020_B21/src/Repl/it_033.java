package Repl;

import java.util.Scanner;

public class it_033 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int mgInDrink = scan.nextInt();

        scan.close();

        int numOfDrinks = 10000 / mgInDrink;
        System.out.println("It would take about "+numOfDrinks+" drinks for a lethal overdose.");
    }
}
