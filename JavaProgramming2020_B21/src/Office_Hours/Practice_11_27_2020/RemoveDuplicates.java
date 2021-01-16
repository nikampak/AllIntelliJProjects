package Office_Hours.Practice_11_27_2020;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4}; // [1, 2, 3, 4]
        ArrayList<Integer> list = new ArrayList<>(); // list is empty we need to add [1, 2, 3, 4]

//        for (int each : arr) {
//            if (list.contains(each)){
//                continue;
//            }
//            list.add(each);
//        }
        for (int each : arr) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        System.out.println(list);   // ArrayList is [1, 2, 3, 4]
        // to return result as an Array
        int[] nonDup = new int[list.size()];
        for (int i = 0; i <= nonDup.length-1; i++){
            nonDup[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nonDup));    // Array is [1, 2, 3, 4]
    }
}
