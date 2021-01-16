package Repl;

public class it_191_Methods_ReversedString {
    public static void main(String[] args) {
        String input = "goodbye";

        String reverseStr = "";
        for (int i = input.length()-1; i>=0; i-- ) {
            reverseStr += input.charAt(i);
        }
        System.out.println(reverseStr);//eybdoog
    }
}
