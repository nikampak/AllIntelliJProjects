package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abab";

        String nonDup = "";
        for (int i = 0 ; i<= str.length()-1; i++){ // i< str.length() --> same thing
          //  str.charAt(i);
            if (!nonDup.contains(""+str.charAt(i)  )) {
                continue; // skip it
            }else{
                nonDup+= str.charAt(i);
            }
        }
    }
}
