package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing bed == $120");
            System.out.println("\t\tQueen bed == $100");
            System.out.println("\t\tSingle bed == $80");

            String word = scan.next().toLowerCase();

            while (!(word.equalsIgnoreCase("King") || word.equalsIgnoreCase("Queen") ||
                    word.equalsIgnoreCase("Single"))) {
                System.out.println("Invalid entry, please re-entry");
                word = scan.next().toLowerCase();
            }
                total += (word.equalsIgnoreCase("King")) ? 120 :
                        (word.equalsIgnoreCase("Queen")) ? 100 : 80;
                System.out.println("Would you like to select another room?");
                String a = scan.next().toLowerCase();

            while( !(a.equalsIgnoreCase("Yes")) || (a.equalsIgnoreCase("No"))) {
                System.out.println("Invalid Entry, please re-entry");
                System.out.println("Would you like to select another room?");
            }
            if(a.equalsIgnoreCase("No"))
                break;

            }

        }
    }

/*
 2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates the total price,
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */