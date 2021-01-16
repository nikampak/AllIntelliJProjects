package Repl;

import java.util.Scanner;

public class it_062 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        scan.close();
        word = word.substring(0, 1)+word.substring(word.length()-1);

        System.out.println(word);




    }
}
