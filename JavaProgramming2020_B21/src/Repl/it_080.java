package Repl;

import java.util.Scanner;

public class it_080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        scan.close();

        switch (start) {
            case "A":
                if (end.equalsIgnoreCase("A")) {
                    System.out.println("A found");
                } else if (end.equalsIgnoreCase("B")) {
                    System.out.println("right: B found");
                } else if (end.equalsIgnoreCase("C")) {
                    System.out.println("right > down: C found");
                } else if (end.equalsIgnoreCase("D")) {
                    System.out.println("right > down >left: D found");
                }
                break;
            case "B":
                if (end.equalsIgnoreCase("A")) {
                    System.out.println("down > left > up: A found");
                } else if (end.equalsIgnoreCase("B")) {
                    System.out.println("B found");
                } else if (end.equalsIgnoreCase("C")) {
                    System.out.println("down: C found");
                } else if (end.equalsIgnoreCase("D")) {
                    System.out.println("down >left: D found");
                }
                break;
            case "C":
                if (end.equalsIgnoreCase("A")) {
                    System.out.println("left > up: A found");
                } else if (end.equalsIgnoreCase("B")) {
                    System.out.println("left > up > right: B found");
                } else if (end.equalsIgnoreCase("C")) {
                    System.out.println("C found");
                } else if (end.equalsIgnoreCase("D")) {
                    System.out.println("left: D found");
                }
                break;
            case "D":
                if (end.equalsIgnoreCase("A")) {
                    System.out.println("up: A found");
                } else if (end.equalsIgnoreCase("B")) {
                    System.out.println("up > right: B found");
                } else if (end.equalsIgnoreCase("C")) {
                    System.out.println("up > right > down: C found");
                } else if (end.equalsIgnoreCase("D")) {
                    System.out.println("D found");
                }
                break;

        }
    }
}
