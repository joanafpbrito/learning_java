package FichaPrática_05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [10];
        int small;
        for ( int i=0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i]= input.nextInt();
        }

        small = armario[0];

        for ( int i=0; i < armario.length; i++) {
            if (small > armario[i]) {
                small = armario[i];
            }
        }
        System.out.println("O número maior no seu armário é " + small);
    }
}
