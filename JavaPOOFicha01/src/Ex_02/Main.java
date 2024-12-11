package Ex_02;

public class Main {
    public static void main(String[] args) {
        Dog puskas = new Dog ("Puskás", "rott rafeiro");
        Dog queen = new Dog("Queen", "lobo rafeiro");
        Dog kiara = new Dog ("Kiara", "labrador anão");
        Dog milka = new Dog ("Milka", "rafeiro de caça");

        System.out.println( puskas.getName() + " is "+ puskas.getBreed() +" and says " + puskas.getBark());
        System.out.println( queen.getName() + " is "+ queen.getBreed() +" and says " + queen.getBark());
        System.out.println( kiara.getName() + " is "+ kiara.getBreed() +" and says " + kiara.getBark());
        System.out.println( milka.getName() + " is "+ milka.getBreed() +" and says " + milka.getBark());

        queen.setBark("Auuuuuuuuuu, AAuuuuuuuuuuuuuuuu");

        System.out.println( puskas.getName() + " is "+ puskas.getBreed() +" and says " + puskas.getBark());
        System.out.println( queen.getName() + " is "+ queen.getBreed() +" and says " + queen.getBark());
        System.out.println( kiara.getName() + " is "+ kiara.getBreed() +" and says " + kiara.getBark());
        System.out.println( milka.getName() + " is "+ milka.getBreed() +" and says " + milka.getBark());
    }
}
