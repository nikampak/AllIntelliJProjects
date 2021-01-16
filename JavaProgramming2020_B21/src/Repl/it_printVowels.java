package Repl;

public class it_printVowels {
    public static void main(String[] args) {
        String word = "Bagulazura";
// option 1
        String  vowels = "";
        for (int i = 0; i <= word.length()-1; i++){
            if (word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'a'){
                vowels += word.charAt(i);
            }
        }
        System.out.println(vowels);

// option 2
        String vowels2 = "aeiou";
        String result = "";

        for(int i = 0; i <= word.length()-1; i++){
            if(vowels2.contains(word.charAt(i) + "") ){
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
