package FichaPratica_01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma;
//sem ln o num introduzido pelo user segue na mesma linha
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
//com ln o num introduzido pelo user faz parágrafo

        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("O resultado é " + soma + "!");

    }
}

