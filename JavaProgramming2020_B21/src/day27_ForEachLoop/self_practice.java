package day27_ForEachLoop;

import java.util.Arrays;

public class self_practice {
    public static void main(String[] args) {
        String[] classmates = {"David", "Anna", "Marry", "Gwen", "Sasha", "Dasha", "Robert", "Daniel", "Vlad", "Zoe"};

        for (String eachElement : classmates) {
            String names = eachElement.substring(0, 3);
            System.out.print(names);
        }
        System.out.println();
        System.out.println("======================");

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7};

        int [] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1 ){
           arr3 [i++] = each;
        }
        for (int each : arr2){
            arr3 [i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("======================");

    }
}
