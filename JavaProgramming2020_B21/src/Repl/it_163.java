package Repl;

public class it_163 {

    public int count_appearance(String[] arr,String t){
        int count = 0;

        for (String each : arr){
            if (t.equals(each)){
                count++;
            }
        }

        return count;

    }
}
