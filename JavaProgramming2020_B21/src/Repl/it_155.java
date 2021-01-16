package Repl;

import java.util.Scanner;

public class it_155 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);


    }

    public static void next3(int numb){
        System.out.println((numb+1) +" "+ (numb+2) +" "+ (numb+3));
    }
}
