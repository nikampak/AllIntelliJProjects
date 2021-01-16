package Repl;

import java.util.Scanner;

public class it_038 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();
        String word1 = s.next();
        String word2 = s.next();

        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

    }
}
