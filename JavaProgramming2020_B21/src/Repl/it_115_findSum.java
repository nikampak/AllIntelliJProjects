package Repl;

import java.util.*;

public class it_115_findSum {
    public static void main(String[] args) {

        int[] nums = {2, 2, 0, 3, 5};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers

        //TODO: Write your code below
        int sum = 0;      // why this syntax "int sum = nums[0];" adds +1 to calculation??
        for (int i = 0; i <= nums.length-1 ; i++) {
            sum += nums[i];

        }
        System.out.println(sum);
        System.out.println("+===============================");

        int [] array = {2, 1, 2, 3, 4};
        int sumArray = 0;

        for (int each : array){
            sumArray += each;
        }
        System.out.println(sumArray);
    }
}
