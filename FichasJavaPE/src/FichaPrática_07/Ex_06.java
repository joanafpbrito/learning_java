package FichaPrática_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPrática_07.biblioteca.dividirArray;
import static FichaPrática_07.biblioteca.usingScanner2;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {

        //dividirArray("files/exercicio_06.txt", ",");

        Scanner sc = new Scanner(new File("files/exercicio_06.txt"));

        int idadePessoaVelha = 0;
        String nomePessoaVelha = "";

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (Integer.parseInt(linhaSeparada[1]) > idadePessoaVelha) {
                idadePessoaVelha = Integer.parseInt(linhaSeparada[1]);
                nomePessoaVelha = linhaSeparada[0];

            }
        }

        System.out.println("******** Pessoa Mais Velha ********");
        System.out.println(nomePessoaVelha + " com " + idadePessoaVelha + " anos.");
    }
}
