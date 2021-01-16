package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_Methods_posIntSum {
    public static void main(String[] args) {
        ArrayList<Integer>posInt = new ArrayList<>(Arrays.asList(2, -2, 1, -1, 3, 4, 5));

        ArrayList<Integer>posIntSum = new ArrayList<>();
        posIntSum.addAll(posInt);
        posIntSum.removeIf(p -> p <= 0);

        System.out.println(posIntSum);
        int sum = 0;
        for (int each : posIntSum){
            sum += each;
        }
        posIntSum.add(posIntSum.size(), sum);
        System.out.println(posIntSum);


    }
}
