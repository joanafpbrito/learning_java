package FichaPratica_04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println("Introduza o número:");
        num = input.nextInt();

        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
    }
}
