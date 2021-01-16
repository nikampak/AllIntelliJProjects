package Repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class it_Methods_ArrayList_swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
        int pos1 = 0, pos2 = 2;

        Collections.swap(list, pos1, pos2);
        System.out.println(list);
    }
}
