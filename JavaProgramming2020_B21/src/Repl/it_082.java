package Repl;
import java.util.Scanner;
public class it_082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
s.close();
        System.out.println(txt.substring(0, txt.length()-1) );
    }
}
