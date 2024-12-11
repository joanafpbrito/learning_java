package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.somatorio;

public class Ex_06 {
    public static void main(String[] args) {

        int numUser, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número:");
        numUser = input.nextInt();

        soma = somatorio(numUser);
        if (soma != 0) {
            System.out.println("A soma dos algarismos do seu número é " + soma);
        } else {
            System.out.println("Introduza um número maior que 0 e menor que 10000!");
        }
    }
}
