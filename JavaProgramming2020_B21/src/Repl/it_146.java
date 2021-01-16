package Repl;

import java.util.Scanner;

class it_146 {
     public static void main(String[] args) {

         plus();
     }

     public static void plus(){
         System.out.println("enter first number:");
         Scanner input = new Scanner(System.in);
         int number1 = input.nextInt();
         System.out.println("enter second number:");
         int number2 = input.nextInt();

         int result = number1 + number2;
         System.out.println(result);
     }
 }

