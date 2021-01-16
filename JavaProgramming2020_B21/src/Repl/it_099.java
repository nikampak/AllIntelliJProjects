package Repl;
import java.util.Scanner;
public class it_099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
scan.close();
        String prefix = str.substring(0, n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));
    }
}
