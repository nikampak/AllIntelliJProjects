package Repl;

public class it_159 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 6, 0, 6, 11, 5};
// Find unique number
        for (int each : nums) {
            int count = 0;
            for (int num : nums) {
                if (each == num){
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each); // 0, 11
            }
        }
    }
}
