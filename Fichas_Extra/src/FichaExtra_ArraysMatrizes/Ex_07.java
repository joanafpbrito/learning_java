package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, num2, count=0;
        System.out.println("Quantos números quer gurdar?");
        num = input.nextInt();

        int [] armario = new int [num];


        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }

        System.out.println("Qual o número que quer remover?");
        num2 = input.nextInt();

        for ( int i = 0 ; i < armario.length; i++) {
            if (armario[i] == num2)
                count++;
        }
        count = armario.length - count;

        int [] armario2 = new int[count];

        //for ( int i = 0 ; i < armario.length; i++) {
            //if (armario[i] != num2) {
                //for ( int l = 0 ; l < armario2.length; l++) {
                    //armario2[l] = armario[i];
                    //System.out.println(armario2[l]);
                //}
            //}
        //}
        int l =0;
        for ( int i = 0 ; i < armario.length; i++) {
            if (armario[i] != num2) {
                armario2[l] = armario[i];
                System.out.print(armario2[l] + " | ");
                l++;
            }
        }
    }
}
