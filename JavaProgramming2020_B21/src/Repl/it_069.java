package Repl;
import java.util.Scanner;
public class it_069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        scan.close();

        String halfWord = word.substring(0, word.length() / 2);

        System.out.println(halfWord+ halfWord);
    }
}
