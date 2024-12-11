package FichaPratica_03;

import java.util.Scanner;

public class Ex_15comajuda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial = 1, cont =1;

        System.out.println("Insira um numero:");
        num = input.nextInt();

        while (cont <= num ) {
            fatorial = fatorial * cont;
            cont++;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
