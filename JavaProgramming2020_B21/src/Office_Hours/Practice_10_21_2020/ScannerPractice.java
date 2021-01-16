package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        scan.close();

        System.out.println("You have entered: "+ score);

    }
}
