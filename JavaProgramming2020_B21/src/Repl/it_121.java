package Repl;
import java.util.Arrays;
import java.util.Scanner;
public class it_121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
input.close();
        String reversed = "";
        //TODO: start your code here

        String []words = sentence.split(" ");

       for (int i = words.length-1; i>=0; i--) {
           reversed += words[i]+ " ";
       }
       reversed= reversed.trim();




        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
