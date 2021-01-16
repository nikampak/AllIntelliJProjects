package Repl;

public class it_174 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int each : nums) {
            int count = 0;
            for (int num : nums) {
                if (each == num) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}
