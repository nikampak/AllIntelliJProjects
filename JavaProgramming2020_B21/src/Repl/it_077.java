package Repl;

import java.util.Scanner;

public class it_077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        scan.close();

        String f = email.substring(0, 1).toUpperCase() + email.substring(1, email.lastIndexOf("_")).toLowerCase();
        String l = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.lastIndexOf("@"));
        String d = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        String top = email.substring(email.indexOf(".")+1, email.length());

        System.out.println("First name: " + f);
        System.out.println("Last name: " + l);
        System.out.println("Domain: " + d);
        System.out.println("Top-Level Domain: " + top);

    }
}