package day05_Concatenation;

public class SalarCalculator {
    public static void main(String[] args) {
       int salary = 120000;
       double stateTaxRate = 0.08;
       double stateTax = salary * stateTaxRate;
       double federalTaxRate = 0.25;
       double federalTax = salary * federalTaxRate;
       double totalTax = stateTax + federalTax;
       double SAT = salary - totalTax;

        System.out.println("Your salary is: "+salary);
        System.out.println("Your State tax is: "+stateTax);
        System.out.println("Your Federal tax is: "+federalTax);
        System.out.println("Your Total tax is: "+totalTax);
        System.out.println("Your Salary after tax is: "+SAT);





    }
}
/*
Var: salary, stateTaxRate, stateTax, federalTax, totalTax, salaryAfterTax

output:
Your salary is: YourSalary
Your State Tax: YourStateTax
Your Federal Tax: federalTax
Your total tax: TotalTax
Your salary after tax: YourSalaryAfterTax
 */