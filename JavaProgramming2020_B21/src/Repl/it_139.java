package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class it_139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        String numStr = "";

        if(num.length > 1) {

            for(int i = 0; i < 2; i++) {
                numStr += num[i] + " ";
            }

            String[] numStrArr = numStr.split(" ");
            System.out.println(Arrays.toString(numStrArr));

        }else {
            System.out.println(Arrays.toString(num));
        }


    }
}
