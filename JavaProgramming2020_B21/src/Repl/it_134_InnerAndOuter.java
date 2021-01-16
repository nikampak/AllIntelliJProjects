package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class it_134_InnerAndOuter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
            scan.close();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        int [] temp = new int [sizeInner];

        for (int i = 0; i <= outer.length-1; i++){
            for (int j = 0; j <= inner.length-1; j++){
                if (outer[i] == inner[j]){
                    temp[j] = outer[i];
                }
            }
        }
        System.out.println(Arrays.equals(inner, temp));

    }
}
