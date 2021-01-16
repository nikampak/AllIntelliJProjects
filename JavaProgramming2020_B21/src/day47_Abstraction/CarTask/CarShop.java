package day47_Abstraction.CarTask;

public class CarShop{
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("E270", "Red", 2021, 55000);
        Toyota toyota = new Toyota("Camry", "Blue", 2020, 19900);
        BMW bmw = new BMW("x6", "White", 2007, 25780);

        System.out.println("Start BMW - ");
        bmw.start();
        System.out.println("Start Toyota - ");
        toyota.start();
    }
}
