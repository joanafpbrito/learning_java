package FichaPratica_01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, troca1, troca2;

        System.out.print("Introduza um número: ");
        valor1 = input.nextInt();

        System.out.print("Introduza outro número: ");
        valor2 = input.nextInt();

        System.out.println(valor1);
        System.out.println(valor2);


        System.out.println("----------");
        System.out.println("A trocar as variáveis...");
        System.out.println("----------");

        // troca1 = valor1;
        // troca2 = valor2;
        // valor1 = troca2;
        // valor2 = troca1;

        // System.out.println(valor1);
        // System.out.println(valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println(valor1);
        System.out.println(valor2);

    }
}
