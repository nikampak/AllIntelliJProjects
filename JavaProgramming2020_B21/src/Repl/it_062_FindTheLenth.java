package Repl;

import java.util.Scanner;

public class it_062_FindTheLenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        scan.close();

        System.out.println("Length is: " + text.length());
    }
}
