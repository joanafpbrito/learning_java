package FichaPrática_05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [] armario = new int [10];
        int big;
        for ( int i=0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i]= input.nextInt();
        }

        big = armario[0];

        for ( int i=0; i < armario.length; i++) {
            if (big < armario[i]) {
                big = armario[i];
            }
        }
        System.out.println("O número maior no seu armário é " + big);
    }
}
