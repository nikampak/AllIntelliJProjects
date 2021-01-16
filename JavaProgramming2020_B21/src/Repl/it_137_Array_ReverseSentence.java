package Repl;

import java.util.Scanner;

public class it_137_Array_ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine(); // Java is fun
        // Reverse an Array sentence
input.close();
        String[] words = sentence.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            System.out.println(words[i]);   // fun
                                            // is
                                            // Java
        }


    }
}
