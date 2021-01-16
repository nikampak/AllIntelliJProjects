package Repl;

public class it_115_Test {
    public static void main(String[] args) {
        String word = "asdf";

        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--){
            reverse += word.toCharArray()[i];
        }
        System.out.println(reverse); //fdsa
    }
}
