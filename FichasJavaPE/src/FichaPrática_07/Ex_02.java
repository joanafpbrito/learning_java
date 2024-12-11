package FichaPrática_07;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPrática_07.biblioteca.usingPrintWriter;
import static FichaPrática_07.biblioteca.usingScanner2;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String path = "files/criarficheiro_exercicio_02.txt";
        //String content = "Será que deu?";

        System.out.println("**Introduza o conteúdo:**");
        String content = input.next();

        usingPrintWriter(path, content);

        usingScanner2(path);
    }
}
