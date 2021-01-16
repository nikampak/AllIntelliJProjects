package Repl;
import java.util.Scanner;
public class it_074_alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        s.close();

        if (a.contains("alejandro")) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }




    }
}
