package Repl;

import java.util.*;

public class it_122_NonDuplicate_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
// {1, 2, 3, 3, 5, 5, 1}
        input.close();

        //TODO: write your code below
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }


    }
}
