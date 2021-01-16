package Repl;

import java.util.Scanner;

public class it_072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        s.close();

        String txt = s.next();

        System.out.println(txt.substring(0, txt.length()-1));


    }
}
