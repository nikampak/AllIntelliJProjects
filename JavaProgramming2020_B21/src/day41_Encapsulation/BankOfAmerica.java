package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Josh", "Jones", 1234567891);

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getBalance());

        obj1.deposit(200);
        obj1.availableBalance();

        obj1.withdraw(-300);
        obj1.availableBalance();


    }
}
