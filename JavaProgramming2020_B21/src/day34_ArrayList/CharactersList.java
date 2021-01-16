package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharactersList {
    public static void main(String[] args) {
        String str = "abcd@!#$ety123lkjfasqwe%^&*890";

        ArrayList<String >  digits = new ArrayList<>(Arrays.asList(str.split("") ) );
        digits.removeIf(p -> !Character.isDigit(p.charAt(0)));

        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p -> !Character.isLetter(p.charAt(0)));

        System.out.println(letters);

        ArrayList<String> specialCharacters = new ArrayList<>(Arrays.asList(str.split("")));
        specialCharacters.removeIf(p -> Character.isLetterOrDigit(p.charAt(0)));
/*
        specialCharacters.removeAll(digits);
        specialCharacters.removeAll(letters);
 */
        System.out.println(specialCharacters);
    }
}
