package Repl;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class it_Methods_Array_sumElementsFrom2Arrays {
    public static void main(String[] args) {
        //add each element value of two arrays and returns a new array
        int[] ints1 = {10, 40, 50,   3,    1};
        int[] ints2 = {11, 0, 500,  44, 1101};
// sum of two arrays  [21, 40, 550, 47, 1102]
        int[] sum = new int[ints1.length];

            for (int i = 0; i<= ints1.length-1; i++){
                sum[i] = ints1[i] + ints2[i];
            }
            System.out.println(Arrays.toString(sum));//[21, 40, 550, 47, 1102]
        ArrayList<Integer>sumArrList = new ArrayList<>();
        for (int each : sum){
            sumArrList.add(each);
        }

        Collections.swap(sumArrList, 0, sumArrList.size()-1);
        System.out.println(sumArrList);
    }
}
