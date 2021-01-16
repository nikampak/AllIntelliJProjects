package Office_Hours.Practice_11_27_2020;
import java.util.ArrayList;
public class CombineTwoArrays {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B', 'C', 'D', 'E',};
        char[] ch2 = {'F', 'G', 'H', 'I'};

        ArrayList<Character> list = new ArrayList<>();

        for (char each : ch1) list.add(each);
        for (char each : ch2) list.add(each);

        System.out.println(list);       // [A, B, C, D, E, F, G, H, I]
    }
}
