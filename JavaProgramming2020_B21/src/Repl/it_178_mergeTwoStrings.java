package Repl;

import java.util.ArrayList;

public class it_178_mergeTwoStrings {
    public static void main(String[] args) {
        String one = "12345";
        String two = "abc";

        String merged = "", longestStr = "";
        int shorterCharCNT = 0;

        if (one.length() > two.length()){
            longestStr = one;
            shorterCharCNT = two.length();
        }else{
            longestStr = two;
            shorterCharCNT = one.length();
        }
        for (int i = 0; i < shorterCharCNT; i++) {
            //
            merged += "" + one.charAt(i) + two.charAt(i);
        }
            merged += longestStr.substring(shorterCharCNT);
            System.out.println(merged);

    }
}
