package FichaPratica_02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;
        String operacao;

        System.out.print ("Insira número 1: ");
        num1 = input.nextDouble();

        System.out.print ("Insira número 2: ");
        num2 = input.nextDouble();

        // operaçao sao caracteres e caracteres sao Strings

        System.out.print ("Insira a operação matemática ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {
            case "+":
                resultado= num1 + num2;
                System.out.println ( num1 + "+" + num2 + "=" + resultado );
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println (num1 + "-" + num2 + "=" + resultado);
                break;
            case "*" :
                resultado = num1 * num2;
                System.out.println (num1 + "*" + num2 + "=" + resultado);;
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println (num1 + "/" + num2 + "=" + resultado);;
                break;
            default:
                System.out.println ("Operação inválida! Introduza novamente.");
                break;
        }
    }
}
