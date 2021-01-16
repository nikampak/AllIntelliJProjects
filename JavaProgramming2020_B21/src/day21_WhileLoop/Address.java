package day21_WhileLoop;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter building number ");
            String buildingNum = scan.next();

            scan.close();

            scan.nextLine();

            System.out.println("Enter street name ");
            String streetName = scan.nextLine();

            System.out.println("Enter apartment name");
            String apartmentNum = scan.next();



            System.out.println("Enter your city name ");
            String cityName = scan.nextLine();

            scan.nextLine();

            System.out.println("Enter your state name ");
            String stateName = scan.nextLine();

            System.out.println("Enter your zipcode");
            int zipcode = scan.nextInt();

            String fullAddress = buildingNum+" " + streetName+" " + apartmentNum+"# " + cityName+" " + stateName+" " + zipcode;
            System.out.println(fullAddress);

            System.out.println("Would you like to Conticue? Yes, No");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")){
                break;
            }



        }
    }

}
