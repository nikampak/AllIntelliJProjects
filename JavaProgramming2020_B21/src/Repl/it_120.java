package Repl;
import java.util.*;
public class it_120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
input.close();
        //write your code below
        String longestWord = words[0];

        for (int i  = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }

        }
        System.out.println(longestWord);
    }
}
