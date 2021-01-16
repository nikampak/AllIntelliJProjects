package day09_IfStatement;

public class MaxMin {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;

        // maximum

        boolean n1IssMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = !n1IssMax && !n2IsMax;

        if(n1IssMax){
            System.out.println(n1 + " is maximum");
        }
        if(n2IsMax){
            System.out.println(n2 + " is maximum");
        }
        if (equal){
            System.out.println("Both are equal");
        }

        // minimum

        Boolean n1IsMin = n1 < n2;
        Boolean n2IsMin = n2 < n1;

        if (n1IsMin){
            System.out.println(n1+ " is minimum");
        }
        if (n2IsMin){
            System.out.println(n2+ " is minimum");
        }
        if (equal){
            System.out.println("Both are equal");
        }


    }
}
