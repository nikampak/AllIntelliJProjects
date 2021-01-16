package Repl;
import java.util.*;
public class it_116 {
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 2, 1, 2,  3,  4, 3, 4};


        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
        int count = 0;
        for(int i=0; i<nums.length; i++ ){
            if(nums[i]%2==0){

                count++;
            }
        }
        System.out.println(count);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        int []numbers = {2, 2, 5, 7, 9, 0,  3,  5, 2, 2};
        int amount = 0;

        for (int each : numbers){
            if (each % 2 == 0){
                amount += each;
            }
        }
        System.out.println(amount);
    }
}
