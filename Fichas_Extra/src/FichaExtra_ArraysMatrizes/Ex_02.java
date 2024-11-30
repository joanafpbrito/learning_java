package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [10];

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }
        for ( int i = (armario.length - 1) ; i >= 0; i--) {
            System.out.print(armario[i] + " | ");
        }
    }
}
