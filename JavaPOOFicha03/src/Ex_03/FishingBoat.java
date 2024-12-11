package Ex_03;

import java.util.ArrayList;

public class FishingBoat {
    private String name;
    private String color;
    private int year;
    private int tripulation;
    private double loadCapacity;
    private Brand boatBrand;
    private ArrayList<Fish> caughtFish;
    private ArrayList<Shellfish> caughtShellfish;

    public FishingBoat(String name, String color, int year, int tripulation, double loadCapacity, Brand boatBrand) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.tripulation = tripulation;
        this.loadCapacity = loadCapacity;
        this.boatBrand = boatBrand;
        this.caughtFish = new ArrayList<Fish>();
        this.caughtShellfish = new ArrayList<Shellfish>();
    }

    public double calculateRealLoad () {
        double realLoad = 0;

        for (Fish fish : this.caughtFish) {
            realLoad += fish.getWeigth();
        }

        for (Shellfish shellfish : this.caughtShellfish) {
            realLoad += shellfish.getWeight();
        }
        return realLoad;
    }

    public void addFish(Fish newFish){
        if (this.calculateRealLoad() + newFish.getWeigth() <= this.loadCapacity) {
            this.caughtFish.add(newFish);
        }
    }

    public void addShellfish(Shellfish newShellfish) {
        if (this.calculateRealLoad() + newShellfish.getWeight() <= this.loadCapacity) {
            this.caughtShellfish.add(newShellfish);
        }
    }

    public void dropFish(int dropIndex) {
        this.caughtFish.remove(dropIndex);
    }

    public void dropShellfish(int dropIndex) {
        this.caughtShellfish.remove(dropIndex);
    }

    public double totalLoadValue() {
        double total = 0;

        for (Fish fish : this.caughtFish) {
            total += fish.getWeigth() * fish.getPriceKg();
        }

        for (Shellfish shellfish : this.caughtShellfish) {
            total += shellfish.getWeight() * shellfish.getPriceKg();
        }
        return total;
    }

    public void details() {
        System.out.println("***** " + this.name + " *****");
        System.out.println("Load Capacity: " + this.loadCapacity + " Kg");
        System.out.println("Current Load: " + this.calculateRealLoad() + " Kg");

        System.out.println("Caught Fish:");
        for (Fish fish : this.caughtFish) {
            fish.details();
        }

        for (Shellfish shellfish : this.caughtShellfish) {
            shellfish.details();
        }

        System.out.println("Total Load Value: " + this.totalLoadValue() + "€");
    }
}
