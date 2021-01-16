package day18_Strings;

public class StringMethod4 {
    public static void main(String[] args) {
        // isEmpty, equals, equalsIgnoreCase, contains, startsWith, endsWith

        String str = "Hello Everyone";
        System.out.println(str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());

        //constains
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("C#"));    // false
        System.out.println(sentence.contains("Java"));  // true

        System.out.println("=============================================================");
        String webAddress = "www.amazon.com";
        boolean isValid = webAddress.startsWith("www.") && webAddress.endsWith((".com"));

        String sentence1 = "I like to learn Java";

        System.out.println(sentence1.contains("C#"));
        System.out.println(sentence1.contains("Java"));

        String webAddress1 = "www.amazon.com";
        boolean validAddress = webAddress1.startsWith("www.") && webAddress1.endsWith(".com");







    }
}
