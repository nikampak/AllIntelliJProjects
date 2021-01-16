package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class it_124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};
input.close();
//      REVERSE an Array of 7 numbers
//      reversing the first item with the last item
//        int temp = nums[0];
//        nums[0] = nums[length-1 ];
//        nums[length-1 ] = temp;

//      reversing the second item with the lastItem-1
//        int temp = nums[0+1];
//        nums[0+1] = nums[length-1-1];
//        nums[length-1-1] = temp;

//      reversing the third item with the lastItem-1
//        int temp = nums[0+2];
//        nums[0+2] = nums[length-1-2];
//        nums[length-1-2] = temp;
        for (int i = 0; i <= nums.length/2; i++){

            int temp = nums[i]; //int temp = nums[0]; we swapped 0 with i
            nums[i] = nums[nums.length-1 - i];
            nums[nums.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
