package day19_ForLoop;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first String");
        String s1 = scan.nextLine();

        scan.close();

        System.out.println("Enter your second String");
        String s2 = scan.nextLine();

        scan.close();

        if(s1.length() > s2.length() ){
            System.out.println(s2);
        }else if( s2.length() > s1.length()){
            System.out.println(s2);
        }else{
            System.out.println("Both are equal");
        }


    }
}
