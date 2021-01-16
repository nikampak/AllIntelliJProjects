package day32_localDate_WraperClass;

import day18_Strings.SubStringMethod;

public class CharacterWrapperClass {
    public static void main(String[] args) {
        char n = 'W';
        System.out.println(Character.isDigit(n));
        System.out.println(Character.isLetter(n));

        String str = "a1b2v3b4c5d6@#$%^&*";

        String digits = "";
        String letters = "";
        String specialChar = "";
        for (char each : str.toCharArray() ) {
            if (Character.isDigit(each)) {
                digits += each;
            }else if (Character.isLetter(each)) {
                letters += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = "+ letters);
        System.out.println("special characters = "+ specialChar);
    }
}
