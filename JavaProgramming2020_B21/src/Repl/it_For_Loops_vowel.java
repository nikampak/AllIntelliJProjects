package Repl;
import java.util.Scanner;
public class it_For_Loops_vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        inp.close();

        for( int i=0; i<=word.length()-1; i++){

            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' ||
                    word.charAt(i)=='u'){
                System.out.print(word.charAt(i));

            }

        }




    }
}
