package day08_ShortHand_Relational;

public class GallonsToLiters {
    public static void main(String[] args) {
        int gallons = 100;
        double liters = gallons*3.785;
        int result = (int) liters;

        System.out.println(gallons+" gallons equal to "+liters); // 100 gallons equal to 378.5
        System.out.println(gallons+" gallons equal to "+result); // 100 gallons equal to 378
        System.out.println(gallons+" gallons equal to "+ (gallons*3.785) + " liters"); // 100 gallons equal to 378.5 liters
        System.out.println(gallons+" gallons equal to "+ (int)(gallons*3.785) + " liters"); //100 gallons equal to 378 liters

    }
}

/*
write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters
 */