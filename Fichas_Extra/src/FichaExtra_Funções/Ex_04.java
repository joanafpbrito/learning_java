package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.imprimirTabuada;

public class Ex_04 {

    public static void main(String[] args) {
        int numUser;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número:");
        numUser = input.nextInt();

        imprimirTabuada(numUser);

    }
}
