package day22_JavaRecap;

public class self_practive_2 {
    public static void main(String[] args) {
        String str = "abcabc";
        String result = "" ; // abc

        for (int i = 0; i < str.length(); i++ ) {
            String eachChar = "" + str.charAt(i);
            if(result.contains(eachChar)) {
                continue;
            }else{
                result += eachChar;
            }
        }
        System.out.println("result = " + result);


    }
}
