package Repl;

import java.util.Scanner;

public class it_079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        scan.close();

        if (word.substring(0, 1).equalsIgnoreCase("x")) {
            word = word.substring(1);
        }
        if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            word = word.substring(0, word.length()-1);
        }
        System.out.println(word);



    }
}
