package bpj.lesson15;

public class Tester {

    public static void main(String[] args) {
        Circle c = new Circle(35.5);

        System.out.println("Diameter: " + c.diameter());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());


        // bank account project
        BankAccount myAccount = new BankAccount("Sally Jones", 1000.00);
        myAccount.deposit(500.00);
        myAccount.withdraw(100.00);
        System.out.println("The " + myAccount.accountHoldersName() + " account balance is, $" + myAccount.getBalance());
    }
}
