package Repl;

import java.util.Scanner;

public class it_064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char lastCharacter = word.charAt(word.length()-1);
        System.out.println(lastCharacter);
    }
}
