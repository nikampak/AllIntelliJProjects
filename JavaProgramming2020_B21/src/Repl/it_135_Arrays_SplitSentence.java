package Repl;

import java.util.Scanner;

public class it_135_Arrays_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine(); // Java is fun
input.close();
// write code to type each word in separate lines
        String [] words = sentence.split(" ");
        for (String each : words) {
            System.out.println(each);   //Java
                                        //is
                                        //fun
        }
    }
}
