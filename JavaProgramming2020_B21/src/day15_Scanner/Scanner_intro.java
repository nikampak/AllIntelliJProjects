package day15_Scanner;

import java.util.Scanner;

public class Scanner_intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte b = input.nextByte();
        input.close();
        System.out.println("our number is: "+b+1);
    }
}
