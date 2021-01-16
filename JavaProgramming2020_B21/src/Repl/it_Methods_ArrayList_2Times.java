package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_Methods_ArrayList_2Times {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 10));

        ArrayList<Integer> twiceNums = new ArrayList<>();
        for (int each : nums) {
            twiceNums.add(each);
            twiceNums.add(each);
        }
        System.out.println(twiceNums);//[1, 1, 5, 5, 10, 10]

    }
}
