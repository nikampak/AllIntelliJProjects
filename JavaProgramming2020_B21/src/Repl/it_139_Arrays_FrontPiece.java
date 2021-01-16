package Repl;

import java.util.Scanner;

public class it_139_Arrays_FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
scan.close();
        //WRITE YOUR CODE HERE

        for (int i = 0; i <= num.length-1 ; i++) {
            if (num.length <= 2 ){
                System.out.println(num[0]);
            }
        }
    }
}
