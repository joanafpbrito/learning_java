package FichaPratica_02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, taxa;

        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("Taxa de 20%: " + taxa);
        } else {
            taxa = salario * 0.3;
            System.out.println("Taxa de 30%: " + taxa);
        }
    }
}

