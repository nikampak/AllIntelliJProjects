package Repl;

import java.util.Arrays;

public class it_208_Methods_populateArray {
    public static void main(String[] args) {
    int[] r = new int[3];

    for (int i = 0; i < r.length; i++){
        r[i] = i+1;// 0, 1, 3
    }
        System.out.println(Arrays.toString(r));//[1, 2, 3]
    }
}
/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */