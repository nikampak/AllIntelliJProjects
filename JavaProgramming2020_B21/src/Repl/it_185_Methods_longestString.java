package Repl;

public class it_185_Methods_longestString {
    public static void main(String[] args) {
        String a = "orange";
        String b = "apple";

        String longestString = (a.length()>b.length())? a : b;
        System.out.println(longestString);

    }
}
