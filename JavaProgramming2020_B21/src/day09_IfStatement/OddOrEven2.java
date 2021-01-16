package day09_IfStatement;

public class OddOrEven2 {
    public static void main(String[] args) {
        int number = 99;
        boolean even = number %2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is even ");

        }
        if(odd){
            System.out.println(number+" is odd number");
        }



    }
}
