package Ex_09;

public class Product {
    private String name;
    private double price;
    private int stock = 0;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void toBuy(int quantity) {
        this.stock += quantity;
    }

    public void toSell(int quantity) {
        if (this.stock >= quantity ) {
            this.stock -= quantity;
            System.out.println("Venda efectuada: " + quantity);
        } else {
            System.out.println("Quebra de stock! Venda não efetuada");
        }
    }

    public void details() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(stock);
    }

}
