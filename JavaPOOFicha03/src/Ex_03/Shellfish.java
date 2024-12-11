package Ex_03;

public class Shellfish {
    private String species;
    private double weight;
    private double priceKg;

    public Shellfish(String species, double weight, double priceKg) {
        this.species = species;
        this.weight = weight;
        this.priceKg = priceKg;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceKg() {
        return priceKg;
    }

    public void details() {
        System.out.println("Species: " + this.species + " | Weight: " + this.weight + "Kg | Price per Kg: " + this.priceKg + "€");
    }
}
