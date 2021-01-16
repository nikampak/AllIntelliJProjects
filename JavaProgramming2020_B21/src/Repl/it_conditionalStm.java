package Repl;

public class it_conditionalStm {
    public static void main(String[] args) {
        String word = "try";

        String newWord = "";
        newWord += (word.endsWith("ey")) ? "eys" : (word.endsWith("y")) ? "ies" : (word.endsWith("ife")) ? "ives" : "s";

        System.out.println(newWord);

    }
}
/*
Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */