package day22_JavaRecap;


import java.util.Scanner;

public class String_Practice1 {
    public static void main(String[] args) {
        String sentence = "My name is Muhtar";
        String name1 = sentence.substring(11);  // Muhtar
        System.out.println(name1);

        String name2 = sentence.substring(11, sentence.length()-1+1); // Muhtar
        System.out.println(name2);

        String str1 = "Thursday is cool, it's a fun day";
        //             012345
        String day = str1.substring(0, 6);
        System.out.println(day);    // Monday, Thurds

        String day2 = str1.substring(0, str1.indexOf(" "));
        System.out.println(day2);   // Thursday

        String s1 = "https://www.google.com";
        String domain = s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);

        String name = s1.substring(s1.indexOf(".")+1, s1.lastIndexOf("."));
        System.out.println(name);

        name = name.substring(0, 1).toUpperCase() + name.substring(1); // Amazon

        System.out.println(name);
        System.out.println("========================================================");

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine().replace(" ","");
        String lastName = scan.nextLine().replace(" ","");

        scan.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName = firstName +" " + lastName;
        System.out.println("Full Name : " + fullName);







    }
}
