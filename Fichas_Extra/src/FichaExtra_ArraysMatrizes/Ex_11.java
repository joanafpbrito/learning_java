package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {


        int armario [][] = new int [4][4];
        Scanner input = new Scanner(System.in);

        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.println("Introduza o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
                armario[l][c]=input.nextInt();
            }
        }

        // imprimir uma matriz
        System.out.println("--------------------------");
        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.print(armario[l][c] + " \t | \t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}
