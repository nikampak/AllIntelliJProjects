package Repl;

public class it_Methods_getDuplicates {
    public static void main(String[] args) {
        String [] r = {"1","2","aa","1", "aa"};
/*
String numberOfDuplicates = "";
        for (String each : r){
            int count = 0;
            for (String each2 : r){
                if (each.equals(each2))
                    count++;
            }
            if (count>1)
                numberOfDuplicates += ""+count;
        }
        return numberOfDuplicates.length();

 */
        String result = "";
        for (String each : r){
            int count = 0;
            for (String rs: r){
                if (each.equals(rs))
                    count++;
            }
            if (count >1)
                result += "" + count;
                System.out.println(result.length());

        }

    }
    public static int getDup(String[] r) {
        String nonDup = "";

        for (String each : r) {
            int count = 0;
            for (String element : r) {
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count > 1) {
                nonDup += "" + count;

            }
        }
        return nonDup.length();
    }
}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, method counts how many of those present in the array.
For example :

getDup(["1","2","aa"',"1"])
returns:2 ("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1", "aa"])
returns:4 ("1" is duplicated and there are two "1"s
           and 2 "aa"s so return is 4)


getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3
 */