package day18_Strings;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringPractices2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();   //mac book
        product = product.replace(" ", "").toLowerCase();   // macbook

        scan.close();

        switch (product) {
            case "macbook":
                System.out.println("Which model MacBook would you like?");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $2400");
                } else if (model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook Pro is $2500");
                } else {
                    System.err.println("Invalid Model for MacBook");
                }
                break;
            case "iphone":
                System.out.println("Which model iPhone would you like?");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equalsIgnoreCase("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if (model2.equalsIgnoreCase("11")){
                    System.out.println("Iphone 11 is $900");
                }else if (model2.equalsIgnoreCase("10")){
                    System.out.println("Iphone 10 is $800");
                }else if (model2.equalsIgnoreCase("8")){
                    System.out.println("Iphone 8 is $700");
                }else{
                    System.err.println("Invalid Model for Iphone");
                }

                break;
            case "ipad":
                System.out.println("Which model iPad would you like?");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3){
                    case "air":
                        System.out.println("iPad air is $500");
                        break;
                    case "pro":
                        System.out.println("iPad pro is $400");
                        break;
                    case "mini":
                        System.out.println("iPad mini is $300");
                        break;
                    default:
                        System.err.println("Invalid model for iPad");

                }
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }
}
/*
Macbook:
    air 2400
    pro 2500

Iphone:
    12 1000
    11  900
    10  800
    8   700
iPad:
    air  500
    mini 300
    pro  400
 */