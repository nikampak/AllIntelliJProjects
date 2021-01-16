package Repl;

import java.util.Arrays;

public class it_129_Arrays_CopyCertainValues {
    public static void main(String[] args) {

// To get words that contains "e" from an Array
        String [] arr = {"zero", "one", "two","three","four"};

        String result = "";
        for (String each : arr
        ) {
            if (each.contains("e")) {
                result += each + " ";
            }
        }
        String[] fewValues = result.trim().split(" ");

        System.out.println(Arrays.toString(fewValues)); // [zero, one, three]
//        int count = 0;
//        for (String each : arr) {
//            if (each.contains("e")) {
//                count++;
//            }
//        }
//        String [] fewValues = new String[count];
//
//        int index = 0;
//        for (int i = 0; i < count; i++) {
//
//            if ( arr[i].contains("e")) {
//                fewValues[index] = arr[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(fewValues));

    }
}
