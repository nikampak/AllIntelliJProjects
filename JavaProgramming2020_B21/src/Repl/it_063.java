package Repl;

import java.util.Scanner;

public class it_063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstChar = word.charAt(0);

        System.out.println(firstChar);
    }
}
