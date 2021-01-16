package Repl;

import java.util.Arrays;

public class it_isSort {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 5};
        boolean isSort = true;

        for ( int each : nums){
            if (Arrays.stream(nums).sorted().equals(nums)) {
                isSort = true;
            }else{
                isSort = false;
            }
        }
        System.out.println(isSort);

    }
}
