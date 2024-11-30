package FichaPratica_02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print ("Insira nota do primeiro teste: ");
        nota1 = input.nextDouble();

        System.out.print ("Insira nota do segundo teste: ");
        nota2 = input.nextDouble();

        System.out.print ("Insira nota do terceiro teste: ");
        nota3 = input.nextDouble();

        media = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4;

        if (media < 0 && media > 20) {
            System.out.println("Nota Inválida!");
        } else {
            System.out.println("Média: " + media);
        }


        if (media >= 9.5) {
            System.out.println("Estás aprovado!");
        } else {
            System.out.println("Game over!");
        }
    }
}
