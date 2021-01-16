package day05_Concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "Daniel"; // "" for the tests
        String lastName = "Johnson";
        String fullName = firstName+" "+lastName; // string ==> text
        char gender = 'F';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        double salary = 120000.5;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.print("Employee' full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print("' gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println(" Year Old");

        System.out.print(fullName);
        System.out.print(" works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print("' Job title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print("' salary is ");
        System.out.println(salary+" $");

        System.out.print(fullName);
        System.out.print(" is full time employee: ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print(" is married: ");
        System.out.println(isMarried);


    }
}
/*
1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

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