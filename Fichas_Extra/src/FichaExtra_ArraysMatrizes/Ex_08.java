package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, num2, num3, count;
        System.out.println("Quantos números quer gurdar?");
        num = input.nextInt();

        int [] armario = new int [num];
        count=num+1;
        int [] armario2 = new int[count];

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }

        // imprimir um array
        System.out.println(" ________________________________________ ");

        for (int l = 0; l < armario.length; l++) {
            System.out.print(armario[l] + " \t | \t " );
        }


        System.out.println("Qual o número que quer acrescentar?");
        num2 = input.nextInt();

        System.out.println("Em que posição?");
        num3 = input.nextInt();
        armario2[num3]= num2;

        for ( int i = 0 ; i < num3; i++) {
            armario2[i] = armario[i];
        }
        for ( int i = (num3+1) ; i < armario2.length; i++) {
            armario2[i] = armario[i-1];
        }

        for ( int i = 0 ; i < armario2.length; i++) {
            System.out.print(armario2[i] + " \t | \t");
        }

    }
}
