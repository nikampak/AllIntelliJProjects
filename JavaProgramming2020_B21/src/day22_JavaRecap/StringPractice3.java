package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {
        String sentence = "Capital of Canada is Washington";

        sentence = sentence.replace("Canada", "United States");
        System.out.println(sentence);

        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
        s = s.replaceFirst("Cybertek", "MIT");
        System.out.println(s);

        String r = "cava is cool programming language, I like to learn cava at cybertek school";
        r = r.replaceFirst("c", "J").replace("rn c", "rn j");
        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java", "C#").replaceFirst("Java", "java");
        p = p.replace("Java", "");
        // p = p.replace("Java", "").replace("like", "like java");
        System.out.println(p);
        System.out.println("===============================================================");

        String str = "                       ";
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);

        System.out.println("===============================");

        String s2 = "I like to learn Java";
        System.out.println("Contains c#: " + s2.toLowerCase().contains("java")); // true

        String s3 = "Cybertek School is the best";
        System.out.println(s3.equalsIgnoreCase("cybertek"));

        System.out.println("Java".isEmpty() ); // false
        System.out.println("".isEmpty());

        System.out.println("================================");
        String URL = "https://www.amazon.com";
        boolean isValid = URL.startsWith("http") && ( URL.endsWith(".com") || URL.endsWith(".edu") || URL.endsWith(".gov"));

        if (isValid){
            System.out.println("URL is valid");
        }else {
            System.out.println("Invalid");
        }
        System.out.println("================================");

        String email = "Java_Masters@java.com";
        boolean validEmail = email.endsWith("gmail.com") || email.endsWith("yahoo.com") || email.endsWith("hotmail.com") ||
                             email.endsWith("outlook.com");

        if (validEmail){
            System.out.println("Email is valid");
        }else{
            System.out.println("Invalid");
        }





















    }
}

