package FichaPratica_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double banana, pera, uva, preco, vale;

        System.out.print("Preço da banana: ");
        banana = input.nextDouble();

        System.out.print("Preço da pêra: ");
        pera = input.nextDouble();

        System.out.print("Preço da uva: ");
        uva = input.nextDouble();

        preco = banana + pera + uva;

        vale = preco * 0.1;

        // poderia ter sido feito com 0.9


        System.out.println("Total: " + preco);
        System.out.println("Total de Desconto: " + vale);
        System.out.print("Total a pagar: " + (preco - vale));
    }
}
