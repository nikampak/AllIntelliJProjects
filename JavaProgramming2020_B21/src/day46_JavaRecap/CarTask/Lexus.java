package day46_JavaRecap.CarTask;

public final class Lexus extends Car {

    public Lexus(String model, String color, int year, double price) {
        super("Lexus", model, color, year, price);
    }

    @Override
    public void star() {
        System.out.println("Starting " +brand+" "+model+" by inserting a key");
    }

}
