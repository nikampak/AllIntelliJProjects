package Repl;

import java.util.Scanner;

public class it_064_MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        scan.close();

        int middleOne = word.length();
        if (middleOne == 1){
            System.out.println(word + word + word);
        }else if (middleOne == 2){
            System.out.println(word + word);
        }else if (middleOne % 2 != 0){

            System.out.println(word.charAt(middleOne/2));
        }else if (middleOne % 2 == 0){
            System.out.println(""+ word.charAt(middleOne/2 - 1)+ word.charAt(middleOne/2 ) );
        }


//        String middleOne = "";
//        if (word.length() % 2 == 0) {
//            middleOne = word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
//            System.out.println(middleOne);
//        } else {
//            System.out.println(word.charAt(word.length() / 2));
//        }
    }
}
