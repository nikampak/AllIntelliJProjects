package Repl;

import java.util.Scanner;

public class it_048 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter name");
        String name = a.next();

        if (name.equals("Chen")){
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }
    }
}
