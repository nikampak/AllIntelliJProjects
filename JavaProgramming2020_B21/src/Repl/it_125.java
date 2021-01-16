package Repl;

import java.util.Scanner;

public class it_125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        scan.close();
        String shortestStr = str[0];
// Find the shortest word in the Array [java, cable, red, vivid, remedy, grace]
        for (String each : str) {
            if ( shortestStr.length() > each.length()) {
                shortestStr = each;
            }
        }
        System.out.println(shortestStr); //red
    }
}
