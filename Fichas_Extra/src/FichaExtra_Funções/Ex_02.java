package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.media;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media;
        System.out.println("Introduza um número:");
        num1 = input.nextDouble();
        System.out.println("Introduza o segundo número:");
        num2 = input.nextDouble();
        System.out.println("Introduza o terceiro número:");
        num3 = input.nextDouble();

        media = media(num1, num2, num3);

        System.out.println( "A média dos três números é " + media);
    }
}
