package FichaPrática_05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [10];
        int [] armarioDois = new int [10];
        int [][] armarioGrande = new int[10][2];

        for ( int i=0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i]= input.nextInt();
        }
        for ( int i=0; i < armarioDois.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armarioDois[i]= input.nextInt();
        }

        for ( int l = 0; l < armarioGrande.length; l++) {
            armarioGrande[l][0] = armario[l];
            armarioGrande[l][1] = armarioDois[l];
            System.out.println(armarioGrande[l][0] + " " + armarioGrande[l][1]);
        }
    }
}
