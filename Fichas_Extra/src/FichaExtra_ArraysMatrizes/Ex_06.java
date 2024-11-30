package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Quantos números quer gurdar?");
        num = input.nextInt();

        int [] armario = new int [num];

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.print(armario[i] + " | ");
        }
    }
}
