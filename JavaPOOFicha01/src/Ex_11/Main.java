package Ex_11;

public class Main {
    public static void main(String[] args) {
        Account theFirst = new Account ("123456789", 1500.0, "Zé Quim");
        Account theSecond = new Account ("987654321", 3000, "Tia Maria");

        theFirst.description();
        theSecond.description();
        theFirst.transfer(250.0, theSecond);
        theFirst.description();
        theSecond.description();

        theFirst.draw(500.0);
        theFirst.description();
        theSecond.deposit(500.0);
        theSecond.description();

    }
}
