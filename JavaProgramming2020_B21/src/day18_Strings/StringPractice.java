package day18_Strings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2); // true

        String s3 = new String("Cat");
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s2); // false

        String s4 = new String("Cat");
        System.out.println(s3 == s4); // false

        //equals ( ) to compare values

        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        String s5 = new String("cat");
        System.out.println(s4.equals(s5));  // false

        System.out.println("=========================");

        String str = "cybertek";
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("===========================");

        String name = "CybertekSchool"; // 14, last index - 13
        int n1 = name.length();
        System.out.println(n1);
        int n2 = name.length()-1;
        System.out.println(n2);

        System.out.println("============================");
        String a = "Cybertek School";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);

        System.out.println("First character: "+firstChar);
        System.out.println("Last character: "+lastChar);

        System.out.println("==============================");
        String b = "Today is Monday";
        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-2);

        System.out.println(secondChar);
        System.out.println(secondLastChar);



    }
}
