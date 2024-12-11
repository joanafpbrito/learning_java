package FichaPratica_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, mediaAritmetica, mediaPonderada;

        System.out.println("O peso dos valores introduzidos para calcular a média ponderada são, respetivamente pela ordem de inserção: 20%, 30% e 50%.");

        System.out.println("Introduza 3 números:");

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        mediaAritmetica = (num1 + num2 + num3) / 3;
        mediaPonderada = ((num1 * 0.2) + (num2 * 0.2) + (num3 * 0.2));

        System.out.println("A média aritmética dos valores introduzidos é: " + mediaAritmetica + ".");
        System.out.println("A média ponderada dos valores introduzidos é: " + mediaPonderada + ".");


    }
}
