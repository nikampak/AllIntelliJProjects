package Repl;

import java.util.Scanner;

public class it_stringCharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        s.close();

        System.out.print("" + txt.charAt(2) + txt.charAt(4)+txt.charAt(5));


    }
}
