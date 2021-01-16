package Self_Practice;

import java.util.Scanner;

public class String_noDuplicateChars {
    public static void main(String[] args) {

        String str = "aabccd"; //abcd

        String result = "";

        //option#1
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }
        System.out.println(result); //abcd
        //option#2
        for (int i = 0; i <= str.length() - 1; i++) {
            if (result.contains("" + str.charAt(i))) {
                continue;
            }else {
                result += "" + str.charAt(i);
            }
        }
        System.out.println(result);

    }
}
