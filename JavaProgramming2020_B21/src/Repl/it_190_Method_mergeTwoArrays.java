package Repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class it_190_Method_mergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1 ,2, 3};
        int [] b = {5, 6, 7, 8, 10};

        int[] arr = new int[a.length + b.length];

//        int z = 0;
//        for (int each : a )
//            arr[z]= a[each];
//
//        for (int each : b)
//            arr[z]=b[each];
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){ //index number
            if (i < a.length){
                arr[i] = a[i];
            }else{
                arr[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
