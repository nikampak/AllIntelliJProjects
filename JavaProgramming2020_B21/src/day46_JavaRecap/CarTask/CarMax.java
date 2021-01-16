package day46_JavaRecap.CarTask;

public class CarMax {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("G Class", "Red", 2021, 30000);
        Lexus lexus = new Lexus("RX 350", "White", 2018, 20500);
        BMW bmw = new BMW("X3", "Black", 2019, 45000);
        Tesla tesla = new Tesla("Model 3", "Blue", 2020, 50000);

        mercedes.star();
        lexus.star();
        bmw.start();
        tesla.star();
        System.out.println("=====================================");

        mercedes.drive();
        lexus.drive();
        bmw.drive();
        tesla.drive();
        System.out.println("=====================================");
        bmw.autoPark();
        tesla.autoPilot();
    }
}
