package day17_Strings;
import java.util.Scanner;
public class Cost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost = 0;

        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        input.close();

        if(validPassport.equalsIgnoreCase("yes")){
            cost = 1000;
            System.out.println("Which county do you want to go to");
            input.nextLine();
            String country = input.nextLine();

            System.out.println("How many bags will you have");
            byte bags = input.nextByte();
            
            cost += (bags * 50);    // cost = cost + (bags * 50)

            System.out.println("How many people are you traveling with");
            short numOfPeople = input.nextShort();
            if(numOfPeople >= 3) {
                cost -= 300;    // cost = cost - 300
            }else{
                cost -= (numOfPeople * 100);    // cost = cost - (numOfPeople * 100)
            }
            System.out.println("Enter the name of the people you will travel with");
            input.nextLine();
            String namesOfPeople = input.nextLine();

            System.out.println("Your ticker is booked to " + country + ". We have chargered extra for the "+
            bags + " bags but you are traveling with " + namesOfPeople + " so we are giving a discount." +
                    "Your total cost is " + cost);
        }else{

        }
    }
}
