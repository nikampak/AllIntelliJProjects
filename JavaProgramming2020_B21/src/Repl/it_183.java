package Repl;

public class it_183 {
    public static void main(String[] args) {

        String text = "abcd";
        int maxLength = 2;

        text = text.substring(0, maxLength);
        System.out.println(text); //ab
    }
}
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"
 */