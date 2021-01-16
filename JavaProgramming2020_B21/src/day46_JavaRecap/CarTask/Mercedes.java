package day46_JavaRecap.CarTask;

import javax.management.remote.JMXServerErrorException;

public final class Mercedes extends Car{

    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void star() {
        System.out.println("Starting " +brand+" "+model+" by pushing start button");
    }


}
