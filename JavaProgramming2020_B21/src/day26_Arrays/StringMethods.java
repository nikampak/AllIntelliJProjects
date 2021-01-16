package day26_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // Interview Questions

        String s1 = "acb";     // a, c, b
        String s2 = "bac";     // b, a, c
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

//        System.out.println(Arrays.toString(ch1));   // [a, c, b]
//        System.out.println(Arrays.toString(ch2));   // [b, a, c]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));   // [a, b, c]
        System.out.println(Arrays.toString(ch2));   // [a, b, c]

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println(isAnagram);              // true
        System.out.println("========================================");

        // split(str): method
        String sentence = "Today is great day";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));     // [Today, is, great, day]


    }
}
