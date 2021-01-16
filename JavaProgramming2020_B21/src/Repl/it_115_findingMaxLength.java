package Repl;
import java.util.*;
public class it_115_findingMaxLength {
    public static void main(String[] args) {

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        //write your code below
        String longestWord = words[0];
        for (int j = 0; j <= words.length-1; j++){
            if (longestWord.length()-1 < words[j].length()-1) {
                longestWord = words[j];

            }
        }
        System.out.println(longestWord);
        System.out.println("===================");

        String [] str = {"asaa", "bbbbfb", "whafsstupppp", "losngg" , "jaaaasavvaaaaaaaaaa"};
        String longest = "";

        for ( String each : str ){
            if(longest.length()-1 < each.length()-1){
                longest = each;
            }
        }
        System.out.println(longest);
    }
}
