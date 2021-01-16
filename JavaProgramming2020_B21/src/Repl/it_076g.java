package Repl;
import java.util.Scanner;
public class it_076g {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underScore = email.indexOf("_");
        int at = email.indexOf("@");

        String f = email.substring(0, underScore);
        String l = email.substring(underScore+1, at);
        String r = email.substring(at, email.length());

        if (! email.contains("_") ){
            System.out.println(email);
        }else if (email.contains("_")){
            System.out.println(l+"_"+f+r);
        }else{
            System.out.println("invalid");
        }
    }
}
