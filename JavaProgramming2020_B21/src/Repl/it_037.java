package Repl;

import java.util.Scanner;

public class it_037 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int numCoupons = scan.nextInt();
        scan.close();
        int numCandies = numCoupons / 10;
        int numGumballs = (numCoupons%10)/3;

        if (numCoupons >= 3) {
            System.out.println("Number of Candies: "+ numCandies);
            System.out.println("Number of Gumballs: "+ numGumballs);
        }else{
            System.out.println("Not enough coupons");
        }
    }
}
