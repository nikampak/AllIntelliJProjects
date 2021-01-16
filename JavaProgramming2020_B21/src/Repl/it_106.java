package Repl;
import java.util.Scanner;
public class it_106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

inp.close();

        for (int i =0; i <= word.length()-1; i++) {
            if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'o' || word.charAt(i)== 'i' || word.charAt(i)== 'u') {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
    }
}
