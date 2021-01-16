package day25_ArrayIntro;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();

        String[] weekday = { "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday","Sunday"};
        //                      0           1           2           3         4         5          6

        System.out.println(weekday[number-1]);

    }
}
