package day23_NestedLoop;

import java.util.Scanner;

public class self_practice_1 {
    public static void main(String[] args) {
// FrequencyOfWord
//	1. write a program that can return the frequncy of the a word from the sentence
//		Ex:
//			sentence = "Java is a programming language, I like to learn Java";
//			word = "Java";
//			output:
//				2
//				sentence.contains(Java)
        String sentence = "Java is a programming language, I like to learn Java, Java, Java";
        String word = "Java";
        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "C#"); // we need to remove one at a time to count the frequency
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);

//		1.2 check if the number of the cat in sentence is equal to number of the dog
//			senstence = "dog dog Dog Dog cat CAT cAt CAt"
//
//			output:
//				true
        String sentence2 = "dog dog Dog Dog cat CAT cAt CAt";
        String word1 = "Dog";
        String word2 = "Cat";
        int count1 = 0;
        int count2 = 0;

        while (sentence2.toLowerCase().contains(word1)) {
            sentence2 = sentence2.replaceFirst(word1, "");
            count1++;
        }
        while (sentence2.toLowerCase().contains(word1)) {
            sentence2 = sentence2.replaceFirst(word2, "");
            count2++;

        }
        System.out.println(count1 == count2);
//2.  Write a program that asks user to enter a string.
// If string started with uppercase and ends with lowercase letter
// then print true, otherwise print false
//        Ex:
//           Input: Cybertek
//           output: true
//
//           Input: CyberteK
//           output: false
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter a string");
//        String str = scan.next();
//
//        char f = str.charAt(0);
//        char l = str.charAt(str.length()-1);
//
//        if (f >= 65 && f <= 90 && l >= 97 && l <= 122 ){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
//  1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9 10
        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        //      *******
        for (int s = 1; s <= 10; s++) {

            for (int z = 1; z <= 7; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //      *
        //      **
        //      ***
        //      ****
        //      *****
        //      ******
        //      *******
        //      ********

        for (int j = 1; j <= 15; j++) { // j: 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t");
            for (int i = 1; i <= j; i++) { // i: 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("* ");
            }
            System.out.println();

        }
        //	  *********
        //	  ********
        //	  *******
        //	  ******
        //    *****
        //    ****
        //	  ***
        //	  **
        //	  *

        for (int i = 8; i >= 1; i--) {

            for (int j = i; j>=1; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
