package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_195_ArrayList_sizeGet {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(ints);

        int sum = 0;
        for (int each : ints){

        sum += each;
    }
        System.out.println(sum);


    }
}
