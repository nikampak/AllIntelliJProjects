package Repl;
import java.util.Scanner;
public class it_087 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
scan.close();
        int count = 0;

        while (inhabitants > 0) {
            System.out.println("Day "+ count + " [" + inhabitants + "]");
            inhabitants /= 2;
            count++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
