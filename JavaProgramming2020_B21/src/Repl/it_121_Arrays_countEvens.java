package Repl;

import java.util.Scanner;

public class it_121_Arrays_countEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),
                input.nextInt(),input.nextInt(), input.nextInt()};
input.close();
// count even numbers in the Array
        int count = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
