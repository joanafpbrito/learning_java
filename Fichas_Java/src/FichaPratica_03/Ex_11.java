package FichaPratica_03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit, jump, salto;

        System.out.print("Introduza o valor em que quer parar: ");
        limit = input.nextInt();

        System.out.print("Introduza de quantos em quantos quer aumentar: ");
        jump = input.nextInt();

        salto = 0;

        while (salto <= limit ) {
            System.out.println(salto);
            salto = salto + jump;
        }
    }
}
