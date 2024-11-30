package FichaPrática_07;

import java.io.FileNotFoundException;

import static FichaPrática_07.biblioteca.usingScanner;
import static FichaPrática_07.biblioteca.usingScanner2;

public class Ex_01 {
    public static void main(String[] args) throws FileNotFoundException {
        usingScanner();

        usingScanner2("files/exercicio_01.txt");

        usingScanner2("files/exercicio_01_Alternativa01.txt");

        usingScanner2("files/exercicio_01_Alternativa02.txt");
    }

}