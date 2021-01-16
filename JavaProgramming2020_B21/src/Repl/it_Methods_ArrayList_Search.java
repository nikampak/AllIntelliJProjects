package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_Methods_ArrayList_Search {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "four"; //four banana

        String containFind = "";
        for (String each : r)
            if (each.contains(find)) {
                containFind = each;
                System.out.println(containFind);
            }
        if (containFind.isEmpty())
                System.out.println("search failed");
        //search failed
        //search failed
        //four banana
    }
}
