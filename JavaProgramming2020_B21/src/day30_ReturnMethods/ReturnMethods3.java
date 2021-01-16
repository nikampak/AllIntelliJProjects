package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = max(array);
        int max2 = max2 (array);

        System.out.println(max);        //9
        System.out.println(max2);       //9

        int min = min(array);
        System.out.println(min);        // 1
        System.out.println(min < -2); // false


    }
    public static int max (int [] arr) {
        int max = arr[0];

        for (int each : arr ){          // interview question
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    // sort
    public static int max2 (int [] arr) {
        Arrays.sort(arr);               // no sorting on interview
        return arr[arr.length-1];
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (min > each){
                min = each;
            }
        }
        return min;
    }
}
