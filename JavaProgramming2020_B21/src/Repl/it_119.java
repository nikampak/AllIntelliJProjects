package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class it_119 {
    public static void main(String[] args) {

        String email = "info@cybertekschool.com";

        if (!email.contains("@")) {
            System.out.println("Invalid email");
        } else {
            String[] arr = email.split("@");
            if (arr.length == 2) {
                System.out.println("Email id: " + arr[0]);
                System.out.println("Email domain: " + arr[1]);
            } else {
                System.out.println("Invalid email");
            }
        }

        System.out.println("============================");

        String id = "";
        if (!email.contains("@")) {
            System.out.println("invalid email");
        } else {
            String[] array = email.split("@");

        }
        System.out.println("+++++++++++++++++++");
        String sentence = "Hello how are you";
        String[] array = sentence.split("h");

        System.out.println(Arrays.toString(array));

    }
}
