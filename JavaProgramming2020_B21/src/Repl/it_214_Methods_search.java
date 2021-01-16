package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_214_Methods_search {
    public static void main(String[] args) {
        ArrayList<String > r = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "one";

        String result = "";
        for (String each : r) {
            if (each.contains(find)) {
                result = each;
                break;
            } else {
                result = "search failed";
            }
        }
        System.out.println(result);

    }
}
