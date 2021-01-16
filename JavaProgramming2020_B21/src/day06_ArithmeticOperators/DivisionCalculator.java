package day06_ArithmeticOperators;

public class DivisionCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int result = num1/num2; //3
        int remainder = num1%num2; //1
        System.out.println(result);
        System.out.println(remainder);

        String finalResult = num1 +"divide by" + num2+" is equal to " + " with a remainder of "+ remainder;
        System.out.println(finalResult);

    }
}
