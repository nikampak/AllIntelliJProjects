package Repl;

public class it_115_findMin {
    public static void main(String[] args) {

        int[] nums = {2, 2, 5, 3, 0};

        int min = nums[0];
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] < min ) {
                min = nums[i];
            }
        }
        System.out.println(min);
        System.out.println("================================");

        int[]arr = {2, 4, 2, 3, -2};
        int minimum = 0;
        for ( int each : arr){
            if(each < minimum){
                minimum = each;
            }
        }
        System.out.println(minimum);
    }
}
