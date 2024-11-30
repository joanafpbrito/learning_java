package FichaPrática_06;

import java.util.Scanner;

import static FichaPrática_06.Ex_03.*;


public class Ex_04 {
// tipo da função nao pode ser int pq vai dar frases como resposta
// falta um return no fim, deveria de ser o case 6?


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("___ Vamos analisar um número ___");
        //System.out.println("* Tem de ser inteiro e positivo! *");
        //int numUser=positivoInteiro();
        int option = 6;

        while (option == 6) {
        System.out.println("Insira o número que quer analisar:");
        int numUser = input.nextInt();

        System.out.println(" A seguir, escollha a opção que deseja: ");
        System.out.println("1. Par ou Ímpar");
        System.out.println("2. Positivo ou negativo");
        System.out.println("3. Primo ou não Primo");
        System.out.println("4. Perfeito ou Não Perfeito");
        System.out.println("5. Trinagular ou Não Triangular");
        System.out.println("6. Trocar de Número");
        option = input.nextInt();

        switch (option) {
            case 1:
                if (even(numUser)) {
                    System.out.println("É um número Par");
                } else {
                    System.out.println("É um número Ímpar");
                }
                option = 6;
                break;

            case 2:
                if (positive(numUser)) {
                    System.out.println("É um número positivo");
                } else {
                    System.out.println("É um número negativo");
                }
                option = 6;
                break;

            case 3:
                if (prime(numUser)) {
                    System.out.println("É um número Primo");
                } else {
                    System.out.println("Não é um número primo");
                }
                option = 6;
                break;

            case 4:
                if (perfeito(numUser)) {
                    System.out.println("É um número Perfeito");
                } else {
                    System.out.println("Não é um número Perfeito");
                }
                option = 6;
                break;

            case 5: if (triangular(numUser)) {
                System.out.println("É um número Triângular");
            } else {
                System.out.println("Não é um número Triângular");
            }
                option = 6;
                break;
            // a quebra do ciclo deveria de ser ao introduzir o nr que quer avaliar, e não obrigar a ir a opção
            default:
                System.out.println("Bye Bye");
        }
        }
    }
}
