package Repl;
import java.util.*;
public class it_107 {
    public static void main(String[] args) {
        int num, digit1, digit2, digit3, digit4, digit5;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number:");
        int number = scan.nextInt();

        scan.close();

        digit1 = number / 10000;
        digit2 = number % 10000  / 1000;
        digit3 =  number % 10000 % 1000   / 100 ;
        digit4 = number % 10000 % 1000 % 100 / 10 ;
        digit5 = number % 10000 % 1000 % 100 % 10 ;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
        }
    }
