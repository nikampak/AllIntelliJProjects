package Repl;
import java.util.Scanner;
public class it_109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();

        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            String n = arr[i].substring(0, 3);
            System.out.println(n);
        }
    }
}
