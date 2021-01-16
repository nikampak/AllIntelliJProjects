package day06_ArithmeticOperators;

public class GallonsToLiters {
    public static void main(String[] args) {
        int gallon = 10;
        double liter = gallon * 3.78541;
        boolean exceeded300Leters = liter > 300;

        System.out.println(gallon+" gallons equal to "+liter+" liters");


        // 120.5 gallons exceeds 300 liters: true/false
        System.out.println(gallon+" gallons exceeds 300 liters: " + exceeded300Leters);
    }
}

/*
Task#2
            galon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                galon = 20
                 output:
                    20 gallons equal to 75.7082 liters
            Hint: 1 gallon = 3.78541 liters
 */