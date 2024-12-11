package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //guardar o total de vezes que se repete riar um array para guardar esses numeros
        int [] armario = new int [12];
        boolean duplicate = false;

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }

        for ( int i = 0 ; i < armario.length; i++) {
            for ( int l = 1 ; l < armario.length; l++) {
                if (armario[i] == armario[l]) {
                    System.out.println(armario[i]);
                    duplicate = true;
                    break;
                }
            }
        }
        if (duplicate == false) {
            System.out.println("Não há valores repetidos!");
        }
    }
}
