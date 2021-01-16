package day22_JavaRecap;

import java.util.Scanner;

public class self_practice {
    public static void main(String[] args) {
        //1.  write a program that asks user to enter 5 numbers and retuns the maximum number
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int max = -2134567890;
        for (int i = 1; i <= 5; i++) {
            int number = scan.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max number is " + max);
//        // 2.  write a program that asks user to enter 5 numbers and returns the minimum number
        System.out.println("Enter five numbers");
        int min = 2134567890;
        for (int i = 1; i <=5; i++) {
            int number = scan.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Minimum number is " + min);
        //3. write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers
        System.out.println("Enter five numbers");
        int max1 = -2134567890;
        int min1 = 2134567890;

        for (int i = 1; i <= 5; i++) {
            int number = scan.nextInt();
            if (number > max1){
                max1 = number;
            }
            if (number < min1) {
                min1 = number;
            }
        }
        System.out.println("Max" + max1);
        System.out.println("Min" + min1);
        //	4. write a program that can divide two numbers without
        //	using / & % operators and retuns the devision and remainder
        System.out.println("Enter numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int count = 0;
        while (a > b ) {
            a -= b;
            count++;
        }
        System.out.println("Result "+count + " with a remainder of "+ a);
        //5. write a program that can multiply two numbers without using *
        int v = scan.nextInt();
        int z = scan.nextInt();
scan.close();
        int count1 = 0;
        while(v > 0 && z >0) {
            v += v;         // 5 * 3 = 15 --> 5 + 5 + 5 = 15???
            count1++;

        }
        System.out.println("Result "+count1);
    }
}
