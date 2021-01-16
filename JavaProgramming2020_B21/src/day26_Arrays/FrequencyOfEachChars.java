package day26_Arrays;

public class FrequencyOfEachChars {
    public static void main(String[] args) {
        String str = "aaabbc";
        String nonDup = "";
        for (int i = 0; i < str.length(); i++){
            String eachChar = "" + str.charAt(i);
            if ( !nonDup.contains(eachChar)) {
                nonDup += eachChar;
            }
        }
        System.out.println(nonDup);
        System.out.println("========================");

//   char ch = nonDup.charAt(0);
//        int count = 0;
//        for (int i = 0; i <= str.length()-1; i++){
//
//            char eachChar = str.charAt(i);
//            if (ch == eachChar) {
//                count++;
//            }
//        }
//        String result = "" + count;
//        System.out.println(result);
//     System.out.println("=============================");

        String result = "";  // "a3b2c1"
        // Step 2: find the frequency of each nonDiup characters from the original string
        for(int j =0; j <= nonDup.length()-1; j++){

            char ch = nonDup.charAt(j); // a, b, c
            int count = 0;  // to contain the frequency of char ch

            for(int i=0; i <= str.length()-1; i++){
                char eachChar =  str.charAt(i);  // a, a, a, b, b, c
                if(ch == eachChar ){
                    count++;
                }
            }
            result +=  ""+ch + count;

        }

/*
	FrequencyOfEachChars
	1. write a program that can return the frequency of characters from a String
			Ex:
				str = "ababaac";
				output:
					a3b2c1
 */




    }
}
