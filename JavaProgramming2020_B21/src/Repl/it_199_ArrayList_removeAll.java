package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class it_199_ArrayList_removeAll {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
        String targetWord = "hi";
        wordList.removeIf(p -> p.equals(targetWord));
        System.out.println(wordList);
    }
}
