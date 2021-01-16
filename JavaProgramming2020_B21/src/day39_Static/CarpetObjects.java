package day39_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()  };
        carpets[0].customOrder(5, 7, 15, false);
        carpets[1].customOrder(5, 7, 15, true);
        carpets[2].customOrder(8, 10, 12, false);
        carpets[3].customOrder(10, 15, 13, true);
        carpets[4].customOrder(15, 20, 20, true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p -> !p.isPersian);

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);
//        regularCarpets.removeIf(p -> p.isPersian); another way to do it

        System.out.println("===============================");

        double totalPriceOfPersianCarpets = 0;
        for (Carpet each : persianCarpets) {
            System.out.println(each);
            totalPriceOfPersianCarpets += each.calcCost();
        }
        System.out.println("totalPriceOfPersianCarpets = " + totalPriceOfPersianCarpets);

        System.out.println("================================");

        double totalPrice = 0;
        for (Carpet each : regularCarpets) {
            System.out.println(each);
            totalPrice += each.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);

        System.out.println("Total price of All carpets: " + (totalPrice+totalPriceOfPersianCarpets));


    }
}
