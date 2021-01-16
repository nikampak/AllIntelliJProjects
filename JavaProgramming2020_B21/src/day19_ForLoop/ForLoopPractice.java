package day19_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Hello");
        System.out.println("+++++++++++++++++++++++++");

        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            System.out.println("hello");
        }
        System.out.println("===========================");

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");    // odd numbers
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i + " ");
        }
        System.out.println("=============================");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");      // even numbers

            System.out.println("==========================");

            for (int s = 0; s <= 100; s++) {
                if (s % 2 == 0) {
                    System.out.print(i + " ");
                }
                }


            }
        }
    }

