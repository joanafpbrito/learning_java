package FichaPrática_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] armario = new int[3][3];

        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.println("Introduza o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
                armario[l][c]=input.nextInt();
            }
        }
        int big = armario[0][0];
        int small = armario[0][0];

        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.print(armario[l][c] + " ");
                if (big < armario[l][c]) {
                    big = armario[l][c];
                }
                if (small > armario[l][c]) {
                    small = armario[l][c];
                }
            }
            System.out.println("");
        }
        System.out.println("O número maior da matriz é " + big );
        System.out.println("O número menor da matriz é " + small );

    }
}
