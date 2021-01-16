package Repl;

import java.util.Scanner;

public class it_047_Real_Estate_Calculator {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots = 0;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your property type:");
        houseType = input.nextLine();

        System.out.println();

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = input.nextInt();

        System.out.println("Do you have a backyard?");
        backyard = input.nextBoolean();
        if (houseType.equals("Condo"))
            System.out.println("Backyard is not available for condo!");

        System.out.println("Do you have garage?");
        garage = input.nextBoolean();
        if(garage==true) {
            System.out.println("How many spots?");
            garageSpots = input.nextInt();
            if (garageSpots > 10 ){
                System.out.println("Pardon,  it's not a public parking!");
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = input.nextFloat();

        System.out.println("How close is highway?");
        highwayAccessibility = input.nextFloat();

        System.out.println("What's the rating of nearest school?");
        schoolScore = input.nextFloat();

        System.out.println("Does any of your family members smoking?");
        smoking = input.nextBoolean();

        switch (houseType){
            case "Condo":
                propertyPrice += 50000;
                propertyPrice += numberOfBedrooms*3000;
                if (garageSpots < 10) {
                    propertyPrice += garageSpots * 2000;
                }
                if (metroAccessibility <= 1){
                    propertyPrice += 10000;
                }else if (metroAccessibility < 3) {
                    propertyPrice += 5000;
                }
                if (highwayAccessibility <= 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility > 1 && highwayAccessibility < 5){
                    propertyPrice +=8000;
                }else if(highwayAccessibility > 5 && highwayAccessibility <= 20){
                    propertyPrice += 4000;
                }
                if (schoolScore >=8 && schoolScore <= 10){
                    propertyPrice += 45000;
                }else if (schoolScore > 4 && schoolScore < 8){
                    propertyPrice += 20000;
                }else{
                    propertyPrice += 5000;
                }
                if (smoking)
                    propertyPrice -= 5000;
                break;

            case "Townhouse":
                propertyPrice += 75000;
                propertyPrice += numberOfBedrooms*3000;
                if(backyard)
                    propertyPrice += 5000;
                if (garageSpots < 10) {
                    propertyPrice += garageSpots * 2000;
                }
                if (metroAccessibility <= 1){
                    propertyPrice += 10000;
                }else if (metroAccessibility < 3) {
                    propertyPrice += 5000;
                }
                if (highwayAccessibility <= 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility < 5){
                    propertyPrice +=8000;
                }else if(highwayAccessibility <= 20){
                    propertyPrice += 4000;
                }
                if (schoolScore > 4){
                    propertyPrice +=5000;
                }else if (schoolScore > 8) {
                    propertyPrice += 20000;
                }else if(schoolScore >=8 && schoolScore <= 10){
                    propertyPrice+= 45000;
                }
                if (smoking)
                    propertyPrice -= 5000;
                break;
            case "Single Family":
                propertyPrice += 95000;
                propertyPrice += numberOfBedrooms*3000;
                if(backyard)
                    propertyPrice += 5000;
                if (garageSpots < 10) {
                    propertyPrice += garageSpots * 2000;
                }
                if (metroAccessibility <= 1){
                    propertyPrice += 10000;
                }else if (metroAccessibility < 3) {
                    propertyPrice += 5000;
                }
                if (highwayAccessibility <= 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility < 5){
                    propertyPrice +=8000;
                }else if(highwayAccessibility <= 20){
                    propertyPrice += 4000;
                }
                if (schoolScore >=8 && schoolScore <= 10){
                    propertyPrice += 45000;
                }else if (schoolScore > 4 && schoolScore < 8){
                    propertyPrice += 20000;
                }else{
                    propertyPrice += 5000;
                }
                if (smoking)
                    propertyPrice -= 5000;
                break;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");

    }
}
