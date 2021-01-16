package day18_Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cybertek";
        str = str.concat(" School");
        System.out.println(str);

        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        String name = "bank of america";
         name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);

        System.out.println("==========================");
        String t1 = "                Hello                 ";
        t1=t1.trim();
        System.out.println(t1);

        String t2 = "                    Hello                  Everyone";
        t2 = t2.trim();
        System.out.println(t2);

        System.out.println("==============================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        firstName = firstName.trim();

        scan.close();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();
        lastName = lastName.trim();

        System.out.println("Your full name is ");


    }
}
