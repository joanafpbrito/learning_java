package Ex_03;

public class Main {
    public static void main(String[] args) {
        Fish sardine = new Fish("Sardine", 10,2);
        Fish salmon = new Fish("Salmon", 100,12);
        Fish saltedCod = new Fish("Salted Cod", 200,22);

        Shellfish shrimp = new Shellfish("Shrimp", 20, 75);
        Shellfish clams = new Shellfish("Clams", 50, 150);
        Shellfish crab = new Shellfish("Crab", 200, 55);

        FishingBoat mary = new FishingBoat("Mary Seas", "white", 2012, 10, 450, Brand.MAZURY);

        mary.addFish(sardine);
        mary.addFish(salmon);
        mary.addFish(saltedCod);

        mary.addShellfish(shrimp);
        mary.addShellfish(clams);
        mary.addShellfish(crab);

        mary.details();

        mary.dropFish(0);
        mary.dropFish(1);

        mary.addShellfish(crab);

        System.out.println();

        mary.details();
    }
}
