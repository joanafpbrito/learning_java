package Ex_01;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int power;
    private int cylinderCapacity;
    private Fuel fuel;
    private double cost;

    public Car(String brand, String model, int year, int power, int cylinderCapacity, Fuel fuel, double cost) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
        this.cylinderCapacity = cylinderCapacity;
        this.fuel = fuel;
        this.cost = cost;
    }

    public void turnOn () {
        if ((2024 - this.year) > 30 ) {
            switch (fuel) {
                case DIESEL:
                    System.out.println("Deita um pouco de fumo... \t Custa a pegar... \t O carro está ligado!");
                    System.out.println("Vrum-vrum-vrum");
                case GASOLINA:
                    System.out.println("Custa a pegar... \t O carro está ligado!");
                    System.out.println("Vrum-vrum-vrum");
                case GPL:
                    System.out.println("Custa a pegar... \t O carro está ligado!");
                    System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (power < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vruuuuuuuuuuuuuum!");
            }
            if (power >= 250){
                System.out.println(" O carro está ligado!");
                System.out.println(" VRUUUUUUUMMMMMMMM ! ");
            }
        }

    }

    public Car race (Car opponent) {
        if ( this.power > opponent.power) {
            return this;
        } else if (this.power < opponent.power) {
            return opponent;
        }else {

            if(this.cylinderCapacity > opponent.cylinderCapacity) {
                return this;
            } else if ( this.cylinderCapacity < opponent.cylinderCapacity) {
                return opponent;
            } else {

                if (this.year > opponent.year) {
                    return this;
                } else if (this.year > opponent.year) {
                    return opponent;
                } else {
                    return null;
                }
            }
        }
   }

    public void details(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
   }


}
