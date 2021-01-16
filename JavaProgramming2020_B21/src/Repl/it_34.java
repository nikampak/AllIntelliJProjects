package Repl;

import java.util.Scanner;

public class it_34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();

        scan.close();

        int quarters = (100-itemPrice)/25;
        int dimes = (100-itemPrice)%25/10;
        int nickels = (100-itemPrice)%25%10/5;

        if(itemPrice % 5 == 0 && itemPrice >= 25 && itemPrice <= 100){
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
        }else{
            System.out.println("Invalid price!");
        }

    }
}
