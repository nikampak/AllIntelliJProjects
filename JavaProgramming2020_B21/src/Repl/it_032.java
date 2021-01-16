package Repl;

import java.util.Scanner;

public class it_032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.close();

        System.out.println("Enter seconds:");
        int secondsInput = input.nextInt();

        int hours = secondsInput / 3600;
        int minutes = secondsInput % 3600 / 60;
        int seconds = secondsInput - (hours*3600+minutes*60);

        System.out.println(hours+ " hours, "+minutes+" minutes, and "+ seconds+" seconds.");
    }
}
