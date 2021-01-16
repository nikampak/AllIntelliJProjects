package day15_Scanner;

import java.util.Scanner;

public class Scanner_short {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a short number:");
        short s = scan.nextShort();

        scan.close();

        System.out.println("Number is: " + s);

        System.out.println(scan.nextShort());

    }
}
