package Repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class it_207_Methods_switchElements {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
//          option 1
//        ArrayList<Integer> swap = new ArrayList<>();
//        for( int each : i){
//            swap.add(each);
//        }
//        Collections.swap(swap, 0, swap.size()-1);
//        System.out.println(swap);
//          option 2
        int temp = i [0];
        i[0] = i[i.length-1];
        i[i.length-1] = temp;
        System.out.println(Arrays.toString(i));
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
