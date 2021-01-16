package Office_Hours.Practice_11_27_2020;
import java.util.ArrayList;
public class FindDuplicates {
    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'B', 'C', 'C', 'D', 'A'};  // [A, A, C, C, 'A']
        ArrayList<Character> duplicatedElementsList = new ArrayList<>();

        for (int i = 0; i <= chars.length-1; i++) { // outer loop repeats the inner loop
            int count = 0;
            for (char each : chars) {               // inner loop repeats the steps "if"
                if (each == chars[i]) {             // finding frequency
                    count++;
                }
            }
//       OR if (count != 1)
            if (count > 1){                          // verifies if the element is duplicated
                duplicatedElementsList.add(chars[i]);
            }
        }
        System.out.println(duplicatedElementsList); // [A, A, C, C, A]
    }
}
