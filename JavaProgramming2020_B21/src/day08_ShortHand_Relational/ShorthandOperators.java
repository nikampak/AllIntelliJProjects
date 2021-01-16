package day08_ShortHand_Relational;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // 10
            a = 30;
        System.out.println(a); // 30
        System.out.println("=============");

        int x =100; // 100 -62 = 38
            x -=62; // x = x- 62; ==> 38
        System.out.println(x);

        double salary = 100000; // tax rate 0.28
          salary -= (salary * 0.28);
          // salary -= 28000
          // salary  = salary - 28000
          // salary  = 100000 - 28000 = 72000

        System.out.println(salary);  //72000.0


        int x2 = 999999;
            x2 -= 25;
        System.out.println(x2); //999974

        double balance = 2000;
               balance -=450;
        System.out.println(balance); //1550.0
               balance -=1000;
        System.out.println(balance); //550.0
                balance += 5000;
        System.out.println(balance);

        String name = "Cyberteck";
            name += " School";
            // name = name + "School"
        System.out.println(name);

        double totalTax = 100000;
            totalTax *= 0.28; // totalTax = 100000 * 0.28
        System.out.println(totalTax);

        int bonus = 5000;
            bonus *= 2 + 1;     //
        System.out.println(bonus);
            bonus *= 3;
        System.out.println(bonus);

        int y3 = 10;
            y3 /= 5;
        System.out.println(y3);

        int house = 500000;
        int months = 240;
        double monthlyPayment = house;
                monthlyPayment /= 240;
        System.out.println(monthlyPayment);

        int a2 = 100;
            a2 %= 3;
        System.out.println(a2); // 1








    }
}
