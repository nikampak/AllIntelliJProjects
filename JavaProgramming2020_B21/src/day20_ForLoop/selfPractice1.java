package day20_ForLoop;

import java.util.Scanner;

public class selfPractice1 {
    public static void main(String[] args) {
        //5. write a program that can reverse any given string
        //			ex:
        //				input: abcd
        //				output: dcba
        //
        //				input: Cybertek
        //				output: ketrebyC
        String str = "abcd";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += "" + i;
        }
        System.out.println(result);
        //6. write a program that can verify if the user entered String is palindrome
        //
        //			ex:
        //				input: Level
        //				output: Level is palindrome
        //
        //				input: java
        //				output: java is not palindrome
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();

        scan.close();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
