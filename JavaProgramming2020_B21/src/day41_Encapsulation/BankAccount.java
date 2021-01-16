package day41_Encapsulation;

public class BankAccount {
    public final static String bankName = "Bank Of America";
    public String firstName, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        setAccountHolder(firstName, lastName);
        setAccountNumber(accountNumber);
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountHolder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName.toUpperCase()+" "+ lastName.toUpperCase();
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        System.out.println("Depositing "+ amount+" to "+ accountNumber);
        setBalance(balance + amount);
    }
    public void withdraw(double amount) {
        if (amount < balance) {
            System.out.println("Not enough balance");
            return;
        }else {
            System.out.println("Withdrawing " + amount + " to " + accountNumber);
            setBalance(balance - amount);
        }
    }
    public void availableBalance(){
        System.out.println("Available Balance of " + getAccountNumber() +
                " is: "+ getBalance());
    }
}
/*
WarmUp tasks:
    create custom class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            public methods:
                    deposit
                    withdraw
                    availableBalance

 */