package day46_JavaRecap.CarTask;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void star() {
        System.out.println("Starting " +brand+" "+model+" by voice control");
    }

    public void autoPilot(){
        System.out.println("Self driving "+brand+" "+model);
    }
}
