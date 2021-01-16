package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class it_130_Arrays_ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
// Arrays - Shift left
//  input: 6, 2, 5, 3
//output: [2, 5, 3, 6]
 //      original    desired
//          j++     i++
//        nums[0] = nums[1]  --> 2
//        nums[1] = nums[2]  --> 5
//        nums[2] = nums[3]  --> 3
//        nums[3] = nums[0]  --> 6

        int temp = nums[0];
// because i-loop goes until the nums.length-1 (index#3) the
// last number int the Array is lost: nums[3] = nums[0]  --> 6,
// we need to create a temp variable to store nums[0]
        for (int i = 1, j = 0; i <= nums.length-1; i++, j++){

            nums[j] = nums[i];
        }                    // because the last number is lost
        nums[nums.length-1] = nums[0];  // nums[3] = nums[0];

        System.out.println(Arrays.toString(nums));
    }
}
