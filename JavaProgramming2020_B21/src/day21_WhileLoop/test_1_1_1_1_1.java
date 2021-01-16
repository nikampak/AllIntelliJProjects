package day21_WhileLoop;

import java.util.Scanner;

public class test_1_1_1_1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if (isTall){
            if (isFast){
                sport = "bascketball";
            }else if (isFlexible){
                sport = "gmnast";
            }else {
                sport = "volleball";
            }
        }else{
            if (isFast){
                sport = "soccer";
            }else{
                sport = "tennis";
            }
        }
        System.out.println(sport);
    }
}
