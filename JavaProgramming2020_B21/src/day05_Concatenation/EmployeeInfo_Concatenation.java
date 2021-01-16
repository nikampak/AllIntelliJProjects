package day05_Concatenation;

public class EmployeeInfo_Concatenation {
    public static void main(String[] args) {
        String firstName = "John"; // "" for the tests
        String lastName = "Deniel";
        String fullName = firstName+" "+lastName; // string ==> text
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 120000.5;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee' full name is: "+firstName);
        System.out.println(fullName+"' gender is: "+gender);
        System.out.println(fullName+"' age is: "+age+" year old");
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+"' Job title is: "+jobTitle);
        System.out.println(fullName+"'salary is "+salary+" $");
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName+" is married: "+isMarried);



    }
}

/*
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

 */