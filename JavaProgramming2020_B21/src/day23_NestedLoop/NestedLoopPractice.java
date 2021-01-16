package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {
        for (int j = 1; j <= 18; j++){
            for (int i = 1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********           <-- 8 stars vertically  + 8 stars horizontally

 */