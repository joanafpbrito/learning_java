package FichaPrática_05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma=0;
        int[][] armario = new int[5][5];
        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.println("Introduza o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
                armario[l][c]=input.nextInt();
            }
        }
        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                soma += armario[l][c];
            }
        }
        System.out.println(soma);
    }
}
