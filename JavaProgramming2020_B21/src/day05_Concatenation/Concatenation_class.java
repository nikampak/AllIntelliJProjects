package day05_Concatenation;

public class Concatenation_class {
    public static void main(String[] args) {
        int houseNumber = 7925;
        String streetName = "Johns Branch Dr";
        String cityName = "McLean";
        String State = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber+" "+streetName+"\n"+cityName+", "+State+", "+zipCode;
        // 7925 Johns Branch Dr
        // McLean, VA, 22000

        System.out.println(fullAddress);

        System.out.println("======================================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        int price = 18000;
        String color = "Red";

        // 2010 Toyota Camry, 55000 miles, Red, $18000

        System.out.println(year+" "+brand+" "+model+", "+mileage+" miles, "+color+", $"+price);







    }
}
