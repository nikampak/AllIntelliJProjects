package Repl;

import java.util.Scanner;

public class it_136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        // 1. go through the array 2 items at a time
        // 2. then check for the value equals to 5 or not
        // 3. last chance to get 2 items is at index right before last item
        boolean result = false;
        for (int i = 0; i <= nums.length-2; i++){
  //          System.out.println(nums[i] + " " + nums[i+1]);  // go through the array 2 items at a time
            if (nums[i] == 5 && nums[i+1]==5){  // then check for the value equals to 5 or not
                result = true;
            }
        }
        System.out.println(result);
    }
}
//Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
//If no consecutive 5s or no 5s are detected in your code then print false.
//nums → [1, 5, 5, 1, 1] → true
//nums → [1, 8, 5, 5, 0] → true
//nums → [1, 5, 4, 1, 5] → false
//nums → [1, 4, 4, 1, 99] → false
