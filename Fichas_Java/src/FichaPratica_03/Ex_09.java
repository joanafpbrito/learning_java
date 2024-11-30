package FichaPratica_03;

import java.util.Scanner;

public class
Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, soma, media;

        System.out.print("Introduza um número: ");
        num = input.nextInt();
        soma = num--;
        media = 0;

        while (num != -1 ) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            soma = soma + num;
            media = media + 1;
            if (num == -1) {
                media = soma / media;
                System.out.println("A média dos números é " + media);
            }
        }
    }
}
