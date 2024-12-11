package Ex_06;

public class Main {
    public static void main(String[] args) {
        Athlete theFirst = new Athlete("Cristiano Ronaldo", "Futbol", 1.65, 85, "Portugal");
        Athlete theSecond = new Athlete("Cristiano Ronaldo", "Futbol", 1.65, 85, "Portugal");
        Athlete theThird = new Athlete("Cristiano Ronaldo", "Futbol", 1.65, 85, "Portugal");
        Athlete theFourth = new Athlete("Cristiano Ronaldo", "Futbol", 1.65, 85, "Portugal");

        Competition chess = new Competition ( "Chess Competition", "Portugal", theFourth());
    }


}
