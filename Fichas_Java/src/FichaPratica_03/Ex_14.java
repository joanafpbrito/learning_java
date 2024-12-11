package FichaPratica_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit, num, aux, cont = 1;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir: ");
        limit = input.nextInt();

        System.out.print("Introduza o número: ");
        num = input.nextInt();

        aux = num;

        while ( cont < limit ) {
            System.out.print("Introduza o número: ");
            num = input.nextInt();
            cont = cont +1;
                if (aux >= num) {
                    crescente = false;
                }
            aux = num;
        }
// if (crescente == true) é a mesma coisa que if (crescente) e em baixo nao precisa de ser crescente == false, bastava um else
        if (crescente == true) {
            System.out.println("Os números estão por ordem crescente");
        }
        if (crescente == false) {
            System.out.println("Os números não estão por ordem crescente");
        }
    }
}
