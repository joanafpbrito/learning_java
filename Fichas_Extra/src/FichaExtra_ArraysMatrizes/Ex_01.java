package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [14];

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }
        for ( int i = 0 ; i < armario.length; i++) {
            System.out.print(armario[i] + " | ");
        }
    }
}
