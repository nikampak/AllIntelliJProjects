package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_ArrayList_timesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int i=0;
        for (int each : nums)
            nums.set(i++, each*2);

        System.out.println(nums); //[2, 4, 6, 8, 10]
    }
}
/*
This method should take the ArrayList parameter and multiply every value by two.
 */
