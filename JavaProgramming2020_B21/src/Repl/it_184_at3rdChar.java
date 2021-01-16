package Repl;

public class it_184_at3rdChar {
    public static void main(String[] args) {
        String target = "longword";
        String word = "foo";

        String merge = target.substring(0, 3) + word + target.substring(3, target.length());
        System.out.println(merge);//lonfoogword

    }
}
/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword" lonfoogwor

at3("blabla","a")
will return: "blaabla"

 */