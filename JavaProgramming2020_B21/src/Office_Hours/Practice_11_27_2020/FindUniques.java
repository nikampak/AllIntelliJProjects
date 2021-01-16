package Office_Hours.Practice_11_27_2020;
import java.util.ArrayList;
import java.util.Arrays;
public class FindUniques {
    public static void main(String[] args) {
        // make sure that there's only 1 element like it
        // it makes it Unique
        String[] arr = {"A", "B", "A", "C", "D", "D"};

        ArrayList<String > uniqueElementsList = new ArrayList<>();  // 2- to store result in ArrayList
                                                                    // it is optional, you can just print instead
        for (String element : arr) {      // 1- outer loop repeats all below loop steps
                                          // over and over again
            int count = 0;
            for (String each : arr) {    // 1- this inner loop is responsible for finding

                // frequency of each element
                if (each.equals(element)) {
                    count++;
                }
            }
 //           System.out.print(element + count + " ");    // A2 B1 A2 C1 D2 D2 not preferred
                                                          // **if you need to count you can run print stmt
            if (count == 1) {
 //           System.out.println(element); // [B, C] 1- Print stmt if you don't need to add elements
                                            // to ArrayList or Array
                uniqueElementsList.add(element);       // 2- adding elements to ArrayList
            }
        }
        System.out.println(uniqueElementsList);     // [B, C] 2- print ArrayList

        // 3- adding element to an Array
        String [] uniques = new String[uniqueElementsList.size()];
        for (int i = 0; i <=uniques.length-1; i++){
            uniques[i] = uniqueElementsList.get(i);  // 3- each element of the ArrayList needs to be assigned to
                                                      // each index of the Array
        }
        System.out.println(Arrays.toString(uniques)); // [B, C] 3- print Array
    }
}
