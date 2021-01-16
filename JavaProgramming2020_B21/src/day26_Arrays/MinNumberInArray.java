package day26_Arrays;

import java.util.Scanner;

public class MinNumberInArray {
    public static void main(String[] args) {
//        int[ ] numbers = {300, 100, 400, 50, 500, 150, 170};
//        int min = numbers[0];
//
//        for (int i=0; i <= numbers.length-1; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("how many number would you like to enter?");
        int length = scan.nextInt();

        int[] numbers = new int [length];
        for (int i = 0; i <= length-1; i++) {
            System.out.println("Enter a number");
            numbers [i] = scan.nextInt();

        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
    }
}
