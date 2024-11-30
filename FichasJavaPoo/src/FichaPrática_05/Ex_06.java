package FichaPrática_05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [10];
        int num = armario[0];
        boolean crescente = true;
        for ( int i=0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i]= input.nextInt();
            if (num >= armario[i]) {
                crescente = false;
            } else {
                num=armario[i];
            }
        }
        if (crescente) {
            System.out.println("Os números no seu armário estão por ordem crescente!");
        } else{
            System.out.println("Os números no seu armário não estão por ordem crescente!");
        }
    }
}
