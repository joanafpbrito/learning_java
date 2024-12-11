package Ex_11;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public Account(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void transfer (double howMuch, Account receiver) {
        if (howMuch <= this.balance) {
            this.balance -= howMuch;
            receiver.balance +=howMuch;
            System.out.println("Transfer successful!");
        }else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit (double howMuch) {
        this.balance += howMuch;
    }

    public void draw (double howMuch) {
        if (howMuch <= this.balance) {
            this.balance -= howMuch;
            System.out.println("Success!");
        }else {
            System.out.println("Insufficient balance!");
        }
    }

    public void description () {
        System.out.println("***** Account Holder *****");
        System.out.println("-" + this.accountHolder + "-");
        System.out.println("***** Account Number *****");
        System.out.println("-" + this.accountNumber + "-");
        System.out.println("***** Balance *****");
        System.out.println("-" + this.balance + "-");
    }
}
