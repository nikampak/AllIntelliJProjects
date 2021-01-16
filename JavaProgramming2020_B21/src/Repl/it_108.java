package Repl;
import  java.util.Scanner;
public class it_108 {
    public static void main(String[] args) {

// can we declair "int i = 0;" in here instead of nested while loop below?
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (j <= n) {
            j++;
            int i = 1;
            while (i < j) {
                i++;            // why we can not have iteration after the sout statement
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
