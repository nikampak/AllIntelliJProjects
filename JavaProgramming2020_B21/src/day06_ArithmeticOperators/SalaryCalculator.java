package day06_ArithmeticOperators;

public class SalaryCalculator {
    public static void main(String[] args) {

      /*
        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalRax = salary * federalTaxRate;
        double totalTax = stateTax + federalRax;
        double SAT = salary - totalTax;
*/

        double salary = 100000, stateTaxRate = 0.00, federalTaxRate = 0.21, stateTax = salary * stateTaxRate, federalRax = salary * federalTaxRate,
                totalTax = stateTax + federalRax, SAT = salary - totalTax;

        System.out.println("Your salary is: $ "+salary);
        System.out.println("Your State Tax is: $ " + stateTax);
        System.out.println("Your Federal Tax is: $ "+federalRax);
        System.out.println("Total Tax is: $ " + totalTax);
        System.out.println("Your Salary After Tax is: $ "+SAT);
    }
}
/*
variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax
 */