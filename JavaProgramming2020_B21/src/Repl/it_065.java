package Repl;

import java.util.Scanner;

public class it_065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        scan.close();

        System.out.println(word1+word2+word2+word1);
    }
}
