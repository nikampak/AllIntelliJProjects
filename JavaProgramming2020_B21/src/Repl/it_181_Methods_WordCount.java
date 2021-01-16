package Repl;

public class it_181_Methods_WordCount {
    public static void main(String[] args) {
        String words = "one two three";

        String [] strSplit = words.split(" ");
        int numOfWords = strSplit.length;
        System.out.println(numOfWords);
    }
}
/*
This method gets a string and returns the word count of that string.

example:
wordCount("foo bar")
returns 2
wordCount("one two three")
returns 3
wordCount("bla")
returns 1
 */