package FichaPrática_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] armario = new int[6];
        int num;
        boolean even = false;

        for (int i = 0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i] = input.nextInt();
        }
        num=armario[0];
         for (int i = 0; i < armario.length; i++) {
            if (armario[i] % 2 == 0) {
                if (num < armario[i]) {
                    num = armario[i];
                    even = true;
                }
            }
        }

        if (even) {
            System.out.println("O número par maior no seu armário é " + num);

        } else {
            System.out.println("O seu armário não tem números pares!");
        }
    }
}

