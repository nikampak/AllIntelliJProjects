package day35_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setInfo("Sarah", "1234567898");

        account1.getInfo();

        account1.deposit(100);

        account1.withdraw(80);

        account1.withdraw(20);

        account1.deposit(100000);

        account1.showBalance();

        BankAccount account2 = new BankAccount();

        account2.setInfo("Veronica", "1234567897");

        account2.deposit(2000000);

        account2.withdraw(150000);

        account2.showBalance();

        account1.withdraw(100);

        account1.showBalance();




    }
}
