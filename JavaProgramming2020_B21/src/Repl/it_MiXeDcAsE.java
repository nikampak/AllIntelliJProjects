package Repl;

public class it_MiXeDcAsE {
    public static void main(String[] args) {
        String s = "powerful";

        String mixedCaseS = "";
        for (int i = 0; i < s.length(); i++) {
            mixedCaseS += (i%2 == 0) ? s.substring(i, i+1).toLowerCase() : s.substring(i, i+1).toUpperCase();
        }
        System.out.println(mixedCaseS);
    }
}
