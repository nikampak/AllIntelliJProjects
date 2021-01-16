package Repl;

import java.util.Scanner;

public class it_152 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);

    }//end of main method

    // write your codes here:
    public static void plus_minus(int[]arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int each : arr){
            int n = (each > 0) ? positives++ : (each < 0)? negatives++ : zeros++;
        }
        System.out.println("positives:"+positives+", negatives:"+negatives+", zeros:"+zeros);
    }
}
