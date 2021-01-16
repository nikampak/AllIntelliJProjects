package Repl;
import java.util.Scanner;
public class it_093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        scan.close();
        System.out.println(word.indexOf("java")==0 || word.indexOf("java")==1);

    }
}

