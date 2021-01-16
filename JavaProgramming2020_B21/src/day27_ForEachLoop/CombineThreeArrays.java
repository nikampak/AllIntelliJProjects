package day27_ForEachLoop;

import java.util.Arrays;

public class CombineThreeArrays {
    public static void main(String[] args) {
        String[] group1 = {"Sara", "Jesicca", "Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"James", "Bonda", "Indiana", "Jones","Max", "Payne"} ;
        String[]group3 = {"Abdul", "Sacha", "Amin", "Salih", "Jessica"};

        String[] groups = new String[group1.length + group2.length + group3.length] ;
        int i = 0;

        for (String eachName : group1) {
            groups[i++] = eachName;
        }
        for (String eachName : group2) {
            groups[i++] = eachName;
        }
        for (String eachName : group3) {
            groups[i++] = eachName;
        }



        System.out.println(Arrays.toString(groups));
    }
}
