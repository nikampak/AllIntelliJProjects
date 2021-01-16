package day11_MultiBranchIf;

public class MaxMin1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20000;

        int max1 = 0;

        if( a>b ){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println("Max number in If: "+max1);

        int max2 = (a > b) ? a : b;
        System.out.println("Max number in Ternary: "+max2);



    }
}
