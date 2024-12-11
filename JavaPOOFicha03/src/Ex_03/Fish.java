package Ex_03;

public class Fish {
    private String species;
    private double weigth;
    private double priceKg;

    public Fish(String species, double weigth, double priceKg) {
        this.species = species;
        this.weigth = weigth;
        this.priceKg = priceKg;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getPriceKg() {
        return priceKg;
    }

    public void details() {
        System.out.println("Species: " + this.species + " | Weight: " + this.weigth + "Kg | Price per Kg: " + this.priceKg + "€");
    }
}
