package day10_IfElseStatement;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 200;
        int n2 = 100;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3 < n2; //
        boolean n2IsMin = !n3IsMin && n2 < n1;
                        // n2 < n1 && n2 < n3;
        boolean n1IsMin = !n3IsMin && !n2IsMin;
                        // n1 < n2 && n1 < n3;

        String str = " is minimum number";

        if(n3IsMin) {
            System.out.println(n3 + str);
        }
        if(n2IsMin){
            System.out.println(n2+str);
        }
        if(n1IsMin){
            System.out.println(n1+str);
        }
    }
}
