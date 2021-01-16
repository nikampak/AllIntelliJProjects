
package Repl;

import java.util.Scanner;

public class it_086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, answer, guest = "";

        do {
            System.out.println("Please enter guest name:");
            name = input.next();

            guest += name;

            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
input.close();
            if (answer.equalsIgnoreCase("yes")) {
                guest += ", ";
            }

        }while (answer.equalsIgnoreCase("yes")) ;
            System.out.println("Guest's list: " + guest);


    }
}
