package day15_Scanner;

import java.util.Scanner;

public class Scanner_evenOrOdd {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        if(num%2==0){
            System.out.println("Number is even: "+num);
        }else{
            System.out.println("Number is odd: "+num);
        }
    }
}
