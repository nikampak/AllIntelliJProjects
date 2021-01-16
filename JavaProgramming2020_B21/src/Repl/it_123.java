package Repl;

import java.util.Scanner;

public class it_123 {
    public static void main(String[] args) {
        int treeSize = 0;

        for (int i = 1 ; i <= 10 ; i++) {
            int year = i;

            if (year <= 3) {
                treeSize = year;
                System.out.println("year " + year + " - growth 1 cm" + "\ntree size: " + treeSize+"cm");
            } else if (year > 3 && year <= 10) {
                treeSize = (year - 3) * 2 + 3;
                System.out.println("year " + year + " - growth 2 cm" + "\ntree size: " + treeSize+"cm");
            }
        }
    }
}
