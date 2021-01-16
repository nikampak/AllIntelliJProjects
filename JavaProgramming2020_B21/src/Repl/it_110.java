package Repl;
import java.util.Scanner;
public class it_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        input.close();

        for (int i = 0; i < words.length; i++) {
        String n = words[i].substring(0, 1) + words[i].substring(words[i].length()-1);
            System.out.println(n);
        }
    }
}
