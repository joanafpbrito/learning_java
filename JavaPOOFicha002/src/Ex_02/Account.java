package Ex_02;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountHolder;
    private int year = 2023;
    private int loan = 90;
    private double debt = 0;

    public Account(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void askLoan (int value) {
        double limit = balance * 0.90;
        if (limit > value) {
            System.out.println("You reached the limit of loan value!");
        } else if (limit < value) {
            this.balance -= value;
            this.debt += value;
            System.out.println("Loan confirmed!");
        }
    }

    public void details () {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Account holder name: " + this.accountHolder);
        System.out.println("Balance: " + this.balance + "€");
        System.out.println("You have " + this.debt  + "€ in debt!");
    }

}
