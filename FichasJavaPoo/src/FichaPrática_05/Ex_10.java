package FichaPrática_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] armario = new int[3][5];
        int magicNum, count =0;
        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                System.out.println("Introduza o valor da linha " + (l+1) + ", coluna " + (c+1) + ": ");
                armario[l][c]=input.nextInt();
            }
        }
        System.out.println("Que número procura?");
        magicNum = input.nextInt();

        for (int l = 0; l < armario.length; l++) {
            for (int c = 0; c < armario.length; c++) {
                if (magicNum == armario[l][c]) {
                    count++;
                }
            }
        }

        System.out.println("O número mágico aparece " + count + " vezes!");
    }
}
