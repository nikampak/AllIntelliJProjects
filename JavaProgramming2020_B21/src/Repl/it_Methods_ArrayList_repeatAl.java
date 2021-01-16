package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_Methods_ArrayList_repeatAl {
    public static void main(String[] args) {
        ArrayList<Boolean>repeat = new ArrayList<>(Arrays.asList(false, true, true));
        ArrayList<Boolean> copyRepeat = new ArrayList<>();
        copyRepeat.addAll(repeat);
        copyRepeat.addAll(repeat);


        System.out.println(copyRepeat);


    }
}
