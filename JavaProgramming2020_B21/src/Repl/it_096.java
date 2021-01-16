package Repl;

import java.util.Scanner;

public class it_096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String str = "";

        scan.close();

        for(int i = 1; i<=count; i++){
            str +=separator;
            str +=word;
        }
        str = str.replaceFirst(separator,"");
        System.out.println(str);



    }
}
