package Ex_02;

public class Main {
    public static void main(String[] args) {
        Account theFirst = new Account ("123", 1000, "Joaquim");
        theFirst.askLoan(500);
        theFirst.details();


    }
}
