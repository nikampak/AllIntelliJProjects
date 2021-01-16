package day21_WhileLoop;

import java.util.Scanner;

public class test_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next(); // String str = in.nextInt();
        int num = 0;

        switch (str) {
            case "one":
                num = 1;
            break;
            case "two":
                num = 2;
                break;
        }
        System.out.println(num);

        System.out.println("=================");

    }
}
