package Ex_01;

public class Main {
    public static void main(String[] args) {
        Car theFirst = new Car ("Toyota", "auris", 2010, 250, 20, Fuel.GASOLINA, 5.5);

        theFirst.turnOn();

        Car theSecond = new Car("Mercedes", "A45", 2024, 420, 3500, Fuel.GASOLINA, 25);
        Car theThird = new Car("Ferrari", "SF90", 2020, 800, 3500, Fuel.GASOLINA, 30);
        Car theFourth = new Car("Opel", "Corsa", 1985, 90, 1200, Fuel.GPL, 4);

        Car winner = theSecond.race(theThird);

        if (winner == null) {
            System.out.println("Break even!");
        } else {
            System.out.println("The winner is:");
            winner.details();
        }
    }
}
