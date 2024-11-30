package FichaPratica_04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2 = 0, count = 0;

        do {
            System.out.println("Jogador 1 - Introduza um número:");
            num1 = input.nextInt();
        } while  (num1 < 0 && num1 > 100);

        while (num2 != num1) {
            System.out.println("Jogador 2 - Faça a sua tentativa: ");
            num2 = input.nextInt();

            if (num2 > num1){
                System.out.println("Valor superior");
            } else {
                System.out.println("Valor inferior");
            }
            count ++;
        }
        System.out.println("Parabéns! Acertou!");
        System.out.println("Você usou " + count + " tentativas!");
    }
}
