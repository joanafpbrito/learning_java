package FichaPrática_05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] armario = new int[4][4];
        int soma = 0;
        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.println("Introduza o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
                armario[l][c]=input.nextInt();
            }
            soma = soma + armario[l][l];
        }
        System.out.println("A soma dos números da diagonal principal da matriz é " + soma);
    }
}
