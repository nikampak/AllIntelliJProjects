package Repl;

import java.util.Scanner;

public class it_053 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.close();

        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        if (vehicleYear >= 1985 && vehicleYear <= 1998 || vehicleYear >= 2001 && vehicleYear <= 2002 ||
                vehicleYear >= 2004 && vehicleYear <= 2006 ||
                vehicleYear >= 2015 && vehicleYear <= 2017){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
