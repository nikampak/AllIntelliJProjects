package Repl;

import java.util.Scanner;

public class it_068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        scan.close();

        boolean verifyWord = sentence.contains(word);
        System.out.println(verifyWord);
    }
}
