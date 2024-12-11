package FichaPratica_02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String opcao;

        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        System.out.print("Insira número 3: ");
        num3 = input.nextInt();

        System.out.print("Insira D ou C: ");
        opcao = input.next();

        switch (opcao) {
            case "C":
                if (num1 < num2 && num1 < num3 && num2 < num3) {
                    System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
                }
                if (num1 < num3 && num1 < num2 && num3 < num2) {
                    System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
                }
                if (num2 < num1 && num2 < num3 && num1 < num3) {
                    System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
                }
                if (num2 < num3 && num2 < num1 && num3 < num1) {
                    System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
                }
                if (num3 < num1 && num3 < num2 && num1 < num2) {
                    System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
                }
                if (num3 < num2 && num3 < num1 && num2 < num1) {
                    System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
                }
            case "D":
                if (num1 > num2 && num1 > num3 && num2 > num3) {
                    System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
                }
                if (num1 > num3 && num1 > num2 && num3 > num2) {
                    System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
                }
                if (num2 > num1 && num2 > num3 && num1 > num3) {
                    System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
                }
                if (num2 > num3 && num2 > num1 && num3 > num1) {
                    System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
                }
                if (num3 > num1 && num3 > num2 && num1 > num2) {
                    System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
                }
                if (num3 > num2 && num3 > num1 && num2 > num1) {
                    System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
                }
        }
    }
}
