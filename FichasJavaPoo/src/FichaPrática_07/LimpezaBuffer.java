package FichaPrática_07;

import java.util.Scanner;

public class LimpezaBuffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String frase;

        System.out.println("Insira o número");
        numero = input.nextInt();
        System.out.println("Insira a frase:");
        input.nextLine();
        frase = input.nextLine();

        System.out.println("\n\n");

        System.out.println("Número: " + numero);
        System.out.println("Frase: " + frase);

        //a limpeza do buffer tem de ser feita sempre que utilizamos um input int ou double antes. ele vai buscar o enter anterior
    }
}
