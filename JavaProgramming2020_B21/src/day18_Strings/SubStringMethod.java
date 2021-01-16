package day18_Strings;
import java.util.Scanner;
public class SubStringMethod {
    public static void main(String[] args) {
        String str = "Today is Monday";
        //            0123456789
        String day = str.substring(9, 14+1);
        System.out.println(day);

        String email = "cybertek@gmail.com";
        //              0123456789
        String domain = email.substring(9, 13+1);
        System.out.println(domain);
        System.out.println("=================================");

        String a = "apple";
        //          01234
        String b = "banana";
        //          012345
        String ab = a.substring(1, 4+1) + b.substring(2, 5+1);
        System.out.println(ab);





        String s1 = "I like movies and books";
        //           01234567    12
        String word1 = s1.substring(7, 12+1);
        System.out.println(word1);

        System.out.println("===============================");

        String firstName = "cyBErTek"; //Marwan
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1,firstName.length()-1+1).toLowerCase();

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;
        System.out.println(firstName);

       Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        scan.close();

        f= f.substring(0, 1).toUpperCase() + f.substring(1, f.length()-1+1).toLowerCase();

        System.out.println("First name is "+f);

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l = l.substring(0, 1).toUpperCase() + l.substring(1, l.length()-1+1).toLowerCase();

        System.out.println("Full name is "+f+" "+l);

    }
}
