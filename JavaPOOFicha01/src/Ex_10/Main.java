package Ex_10;

public class Main {
    public static void main(String[] args) {
        Employee joana = new Employee("Joana", 1550, "sales");

        joana.description();

        joana.setWage(10.0);

        joana.description();
    }
}
