package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_215_Methods_twoTimes {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,5,3,7));

        ArrayList<Integer>newList = new ArrayList<>();
        for (Integer each : list){
            newList.add(each);
            newList.add(each);
        }
        System.out.println(newList);
    }
}
