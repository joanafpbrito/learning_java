package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.inverNum;

public class Ex_07 {
    public static void main(String[] args) {

        int numUser, soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número:");
        numUser = input.nextInt();

        soma = inverNum(numUser);
        if (soma != 0) {
            System.out.println("O número ao contrário é " + soma);
        } else {
            System.out.println("Introduza um número maior que 0 e menor que 10000!");
        }
    }
}
