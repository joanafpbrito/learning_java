import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, total;
        System.out.println("Introduza o preço do primeiro produto:");
        preco1 = input.nextDouble();
        System.out.println("Introduza o preço do segundo produto:");
        preco2 = input.nextDouble();
        System.out.println("Introduza o preço do terceiro produto:");
        preco3 = input.nextDouble();

        total = (preco1 + preco2 + preco3)*0.90;

        System.out.println("O valor a pagar é " + total + "€");
    }
}
