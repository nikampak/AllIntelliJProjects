package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();      // Java

        scan.close();

        int lastIndex = word.length()-1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println(f+l);
        //                106+97 =203
        System.out.println(""+f+l);
        //                    j a ==ja


    }
}
