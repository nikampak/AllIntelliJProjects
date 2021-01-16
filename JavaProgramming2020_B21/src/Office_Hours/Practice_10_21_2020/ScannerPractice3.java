package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender ");
        String gender = scan.next();

        scan.close();

        System.out.println("Enter your age ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Full name ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zipcode ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Country name ");
        String country = scan.nextLine();

        System.out.println("Enter your salary ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your Company name ");
        String company = scan.nextLine();



    }
}
/*
1. ask gender next
2. ask age nextInt
3. ask full name nextLine
4. ask zipcode nextInt
5. ask country name nextLine
6. ask salary nextDouble
7. ask company name nextLine
 */
