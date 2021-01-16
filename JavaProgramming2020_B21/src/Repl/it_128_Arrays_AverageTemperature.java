package Repl;

import java.util.Scanner;

public class it_128_Arrays_AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
scan.close();
        //      count average of the Temp double number

        for( double each : temps ) {
            total += each;      // summing up all doubles
        }
        k = temps.length;       // counting doubles in the Array
        avgTemp = total/k;      // avgTemp == sum / count
        System.out.println(avgTemp);


    }
}
