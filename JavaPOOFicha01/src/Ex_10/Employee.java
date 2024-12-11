package Ex_10;

public class Employee {
    private String name;
    private double wage;
    private String department;

    public Employee (String name, double wage, String department) {
        this.name = name;
        this.wage = wage;
        this.department = department;
    }

    public double setWage(double percentage) {
        double raise = (wage/percentage) + wage;
        this.wage= raise;
        return wage;
    }

    public void description () {
        System.out.println(name);
        System.out.println(department);
        System.out.println(wage);
    }

}
