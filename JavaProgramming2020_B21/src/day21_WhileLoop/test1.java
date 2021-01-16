
package day21_WhileLoop;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String last = input.nextLine();
        int number = input.nextInt()+1;

        String fullName = "";

        if (number % 2 == 0) {
            fullName = first + " " + last;
        }else{
            fullName = "Not valid name";
        }
        System.out.println(fullName);
    }
}
