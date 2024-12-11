package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.numPequeno;

public class Ex_01 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Introduza um número:");
        num1 = input.nextInt();
        System.out.println("Introduza o segundo número:");
        num2 = input.nextInt();
        System.out.println("Introduza o terceiro número:");
        num3 = input.nextInt();

        System.out.println( "O número mais pequeno é " + numPequeno(num1, num2, num3));
    }
}
