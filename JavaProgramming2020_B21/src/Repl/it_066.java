package Repl;
import java.util.Scanner;
public class it_066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        scan.close();

        if (word1.length() == word2.length()) {
            System.out.println(word1.charAt(0)+""+word2.charAt(0)+
                    word1.charAt(1)+word2.charAt(1)+
                    word1.charAt(2)+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
        }
    }
}
