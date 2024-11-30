package FichaExtra_ArraysMatrizes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] armario = new int [10];
        int num, count =0;
        boolean magicNumber = false;

        for ( int i = 0 ; i < armario.length; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            armario[i] = input.nextInt();
        }
        System.out.println("Que número quer pesquisar?");
        num = input.nextInt();

        for ( int i = 0 ; i < armario.length; i++) {
            if (num == armario[i]) {
                count++;
                magicNumber = true;
            }
        }

        if (magicNumber) {
            System.out.println("O " + num + " existe no array e aparece " + count + " vezes!");
        } else {
            System.out.println("O " + num + " não existe no array!");
        }

    }
}
