package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_193_ArrayList_combineTwoArrays {
    public static void main(String[] args) {
        String []r1 = {"f","o","o"};
        String []r2 = {" b","a","r"};
//add two arrays to arrayList and combine in string
      //option 1
        ArrayList<String> twoArrays = new ArrayList<>(Arrays.asList(r1));
        twoArrays.addAll(Arrays.asList(r2));
        String toString = "";
        for (String each : twoArrays)
            toString += each;
        System.out.println(toString);// foo bar
        //option 2
        ArrayList<String> twoArrays2 = new ArrayList<>();
        for ( String each : r1){
            twoArrays.add(each);
        }
        for ( String each : r2){
            twoArrays.add(each);
        }
        String toStr = "";

        for (String eachItem : twoArrays){
            toStr += eachItem;
        }
        System.out.println(toStr);
    }
}
