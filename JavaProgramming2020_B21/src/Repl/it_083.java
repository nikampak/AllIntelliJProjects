package Repl;

import java.util.Scanner;

public class it_083 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String txt = s.next();
        String twoLetters = txt.substring(0, 2);
        System.out.println(twoLetters);

    }
}
