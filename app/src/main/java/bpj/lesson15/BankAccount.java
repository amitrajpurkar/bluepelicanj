package bpj.lesson15;

public class BankAccount {
    private double balance; //how much money is currently in the account
    private String name; //name of the person owning the account

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public BankAccount(String accountOwnersName, double initialBalance) {
        name = accountOwnersName;
        balance = initialBalance;
    }

    public BankAccount(String accountOwnersName) {
        name = accountOwnersName;
    }

    public String accountHoldersName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
