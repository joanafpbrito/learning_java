package FichaPratica_02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print ("Insira numero 1: ");
        num1 = input.nextInt();

        System.out.print ("Insira numero 2: ");
        num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + "é menor que " + num2);
        } else {
            System.out.println(num2 + "é menor que " + num1);
        }

        // Atenção ao + que serve para concatenar e para somar :p
    }
}
