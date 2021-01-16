package day26_Arrays;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        // last index: 99
        for (int i = 0; i <= 99; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("===========================");
  //1. how many even numbers in the array
     int countEven = 0;
     int countOdd = 0;
     int count3 = 0;
     int count5 = 0;

     for (int i = 0; i < numbers.length; i++) {
         int eachNumber = numbers[i];   // eachNumber: 1,2,3.......100
         if (eachNumber % 2 == 0) {
             countEven ++;
         }else{
             countOdd++;
         }
         if (eachNumber % 3 == 0) {
             count3++;
         }
         if (eachNumber % 5 == 0) {
             count5++;
         }
     }
        System.out.println("Even numbers " +countEven);
        System.out.println("Odd numbers "+countOdd);
        System.out.println("Divisible by 3 - "+ count3);
        System.out.println("Divisible by 5 - "+ count5);

        /*
        1. how many even numbers in the array
        2. how many odd numbers
        3. how many numbers can be evenly divisible by 3
        4. how many numbers can be evenly divisible by 5
         */
    }
}