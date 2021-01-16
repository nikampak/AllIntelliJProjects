package Repl;

import java.util.Scanner;

public class it_070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        scan.close();

        if (word1.length() > word2.length()) {
            System.out.println(word1);

        }else if (word1.length() < word2.length()) {
            System.out.println(word2);
        }else {
            System.out.println("Invalid");
        }
    }
}
