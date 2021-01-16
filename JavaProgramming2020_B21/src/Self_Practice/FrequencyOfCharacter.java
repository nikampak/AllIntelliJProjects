package Self_Practice;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: "); // aaajbbbbkccccddz
        String str = scan.next();

        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
