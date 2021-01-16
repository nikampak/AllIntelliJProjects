package Repl;

import java.util.Scanner;

public class it_043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        switch (a){
            case "a":
                System.out.println("a is wrong");
                break;
            case "b":
                System.out.println("b is correct");
                break;
            case "c":
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(a + " is not a valid answer");

        }
    }
}
