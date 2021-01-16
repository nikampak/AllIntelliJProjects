package Repl;
import java.util.Scanner;
public class it_loopDrawRect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

s.close();

        for (int i = n; i > 0; i--) {           // vertical, column
            for (int j = 1; j <= 3; j++) {      // horizontal, row
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
