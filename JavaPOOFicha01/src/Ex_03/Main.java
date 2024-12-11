package Ex_03;

public class Main {
    public static void main(String[] args) {
        Rectangle theFirst = new Rectangle(12.5, 25.0);
        Rectangle theSecond = new Rectangle( 35.5, 42.0);


        System.out.println("You're rectangle is " + theFirst.area() + " square meters and " + theFirst.perimeter() + " meters around");
        System.out.println("You're rectangle is " + theSecond.area() + " square meters and " + theSecond.perimeter() + " meters around");

    }
}
