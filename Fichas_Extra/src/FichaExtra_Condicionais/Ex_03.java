package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;

        System.out.println("Introduza o valor do seu produto:");
        price = input.nextDouble();

        if (price > 100) {
            price = price - price*0.10;
        }

        System.out.println("Valor a pagar é " + price + "€");
    }
}
