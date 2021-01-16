package Repl;
import java.util.Scanner;
public class it_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
scan.close();
        int countJ = 0;
        int countP = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {
            if (sentence.substring(i, i+4).contains("java")){

                countJ++;
                }
        }
        for (int i = 0; i <= sentence.length()-6; i++) {
            if (sentence.substring(i, i+6).contains("python")) {

                countP++;
            }

        }
        System.out.println(countJ == countP);

    }
}
