package Self_Practice;

import java.util.Scanner;

public class UniquesNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.next();

     //   OPTIONAL!!
     //   String unique = "";

        for (int i = 0; i <= str.length()-1; i++) {     // index <= str.length() -1
            // purpose of this loop is to iterate through the char one at a time
     //     char ch = str.charAt(i);
            int frequency = 0;      // resetting the value each iteration of the outer loop (first loop)
            for ( int j = 0; j <= str.length()-1; j++) { // for finding the frequency of one character at a time
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {   // if frequency is 1, it means the ch is unique
                System.out.print(str.charAt(i));
      //          unique += ch;
            }

        }
     //   System.out.println(unique);

    }
}