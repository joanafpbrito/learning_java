package FichaPrática_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetor = new int[5]; // preencherVetor, fazer esta função
        int pesquisa = 0;

        while(true) {
            try {

                System.out.println("******Pesquisa no vetor:******");
                System.out.println("Indice a pesquisar:");
                pesquisa = input.nextInt();

                System.out.println(vetor[pesquisa]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Index inválido!");
            } catch (InputMismatchException exc) {
                System.out.println("Tem de ser um número inteiro entre 0 e 4!");
                input.nextLine(); // Limpeza de buffer
            }

    }
    }
}
