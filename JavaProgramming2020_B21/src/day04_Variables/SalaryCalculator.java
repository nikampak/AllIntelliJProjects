package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;
        double SAT = salary * (1 - tax);

        System.out.println(SAT);




    }
}

/*
 write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax = 0.28
                   salary after tax = 72000
 */