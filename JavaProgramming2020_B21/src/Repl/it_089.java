package Repl;
import java.util.Scanner;
public class it_089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
scan.close();
// using charAt
        int firstLastChar = word.length();
        System.out.println(""+word.charAt(0)+word.charAt( firstLastChar -1 ) );
// using substring
        System.out.println(word.substring(0,1)+ word.substring(word.length()-1));
    }
}
