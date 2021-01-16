package day07_UnaryOperators;

public class EvelyDivisibility {
    public static void main(String[] args) {
        int number = 30;
        int remainter0f2 = number % 2;
        boolean divisibleBy2 = remainter0f2 < 1;


        System.out.println(number+" is divisible by 2: " +divisibleBy2); // Result: 65 is divisible by 2: false

        int remainder0f3 = number % 3;
        boolean divisibleBy3 = remainder0f3 < 1;

        System.out.println(number+" is divisible by 3: "+divisibleBy3); // 2 < 1 Result: 65 is divisible by 3: false

        int remainder0f5 = number % 5;
        boolean divisibleBy5 = remainder0f5 < 1; // 0< 1

        System.out.println(number+" is divisible by 5: "+divisibleBy5); // 0 < 1 Result: 65 is divisible by 5: true



    }
}
/*
Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

 */