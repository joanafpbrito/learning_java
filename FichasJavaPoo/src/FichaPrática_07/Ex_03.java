package FichaPrática_07;


import java.io.FileNotFoundException;
import java.io.IOException;

import static FichaPrática_07.biblioteca.*;

public class Ex_03 {

    public static void main(String[] args) throws IOException {
        copyFile ( "files/exercicio_03.txt", "files/criarficheiro_exercicio_02.txt");

        usingScanner2("files/criarficheiro_exercicio_02.txt");

        copyFile ( "files/exercicio_03_Alternativa01.txt", "files/criarficheiro_exercicio_02.txt");

        usingScanner2("files/criarficheiro_exercicio_02.txt");

        copyFile2 ( "files/exercicio_03_Alternativa01.txt", "files/criarficheiro_exercicio_02.txt");

        usingScanner2("files/criarficheiro_exercicio_02.txt");

    }
}

