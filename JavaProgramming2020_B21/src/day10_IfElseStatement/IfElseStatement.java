package day10_IfElseStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int number = 101;
        boolean isEven = number%2 == 0;

        if( isEven){
            System.out.println(number+" is even");
        }
        if(!isEven){
            System.out.println(number+" is odd");
        }
        System.out.println("================================");

        if(isEven){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
        System.out.println("==================================");


    }
}
