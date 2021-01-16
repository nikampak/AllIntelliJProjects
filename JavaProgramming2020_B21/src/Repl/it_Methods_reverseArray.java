package Repl;

import java.util.Arrays;

public class it_Methods_reverseArray {
    public static void main(String[] args) {

        String[] arr = {"apple", "pear", "bear", "shoe"};

        String [] reverseArr = new String[arr.length];
        for (int i = arr.length-1, j=0; i >=0 ; i--, j++){
            reverseArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
