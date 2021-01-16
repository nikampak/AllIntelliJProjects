package day21_WhileLoop;

import java.util.Scanner;

public class StringReversePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = scan.nextLine(); // java
                                        //0123
        scan.close();
        String reversedWord = "";

        int lastIndex = word.length()-1;
        for (int i = lastIndex; i >=0; i-- ){
         reversedWord += word.charAt(i);
        }
        System.out.print(reversedWord);

        boolean isPalindrome = word.equalsIgnoreCase(reversedWord);
        System.out.println(isPalindrome);
    }
}
