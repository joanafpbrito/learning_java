package Ex_04;

public class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public double area() {
        double area = 3.14*(radius*radius);
        return area;
    }

    public double circunference() {
        double circunference = 2*(3.14*radius);
        return circunference;
    }
}
