package Repl;

public class it_182_Methods_CleanBadWords {
    public static void main(String[] args) {
        String text = "one two three";
        String badWord = "two";

        text = text.replaceAll(badWord, "");
        System.out.println(text);//one  three
    }
}
/*
This method gets two strings (text and badWord)  and returns a string.
basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
 */