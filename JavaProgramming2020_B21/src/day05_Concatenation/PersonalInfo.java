package day05_Concatenation;

public class PersonalInfo {
    public static void main(String[] args) {
        String firstName = "Brianna";
        String lastName = "Suess";
        String fullName = firstName+" "+lastName;
        int age = 28;
        char gender = 'F';
        String phoneNumber = "555-555-5555";
        String SSN = "777-77-7777";

        System.out.println("Full name is: "+fullName);
        System.out.println("Age is: "+age+" years old");
        System.out.println("Gender is: "+gender);
        System.out.println("Phone Number is: "+phoneNumber);
        System.out.println("SSN is: "+SSN);



    }
}
/*
Variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN

Output:
full name is:
age is: YourAge years old
gender is: YourGender
Phone Numberis: YourPhoneNumber
SSN is: YourSSN

PS use concatenation
 */