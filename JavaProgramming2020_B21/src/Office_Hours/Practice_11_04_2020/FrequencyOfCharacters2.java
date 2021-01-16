package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {
        String str = "aaaabbbbcccdd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

        }
        char ch = str.charAt(0);  // represents characters. also can be used char ch = 'a';
        int count = 0;      // represents frequency
        for (int i = 0; i < str.length(); i++) { // ot find the frequency of one character by comparing
            // it with the string
            if (ch == str.charAt(i)) {
                count++;
            }
            if (result.contains("" + ch)) {     // if the char is already in the resul, we don't need to concate it
                continue;
            }
        }

        result += ""+ch + count;
        System.out.println(result);
    }

    static class UniquesAndDuplicates {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a String: ");
            String str = scan.next();
            // "aabccd"

            String unique  = "";  // "bd";
            String duplicates = ""; // "aacc"

            for(int j = 0; j <= str.length()-1; j++){

                char ch = str.charAt(j); // 'a', 'a', 'b', 'c', 'c', 'd'
                int frequency = 0 ;  // frequency of ch

                for(int i = 0; i <= str.length()-1; i++){ // for finding the frequency of one character at a time
                    if( str.charAt(i) == ch){
                        frequency++;
                    }
                }

                if(frequency == 1){ // if frequency is 1, it means the ch is unique
                    unique += ch;
                }

                if(frequency > 1 ){ // if frequency is more than 1, it means the ch is duplicated
                    // && !duplicates.contains( ""+ch ) ;  // in order to contain one char
                    duplicates += ch;
                }


            }


            System.out.println(unique);
            System.out.println(duplicates);
        }
    }
}
