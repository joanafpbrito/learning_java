package FichaPrática_05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double comissao = 0;
        double[] ano = new double[12];

        for (int i = 0; i < ano.length; i++) {
            System.out.println("Introduza a comissão do mês " + (i+1) + ":");
            ano[i]= input.nextInt();
            comissao += ano[i];
        }

            System.out.println("Este ano ganhou " + comissao + " de comissão de vendas!");
    }
}
