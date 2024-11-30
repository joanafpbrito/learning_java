package FichaPrática_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPrática_07.biblioteca.dividirArray;
import static FichaPrática_07.biblioteca.usingScanner2;

public class Ex_08 {

    public static void main(String[] args) throws FileNotFoundException {
        usingScanner2("files/exercicio_08.csv");

        //dividir o array por coma. ultima posicção que neste caso é a 3 é o valor que queremos somar

        // dividirArray("files/exercicio_08.csv", ",");

        Scanner sc = new Scanner(new File("files/exercicio_08.csv"));
        double soma= 0;
        String linha = sc.nextLine();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");
            soma += Double.parseDouble(linhaSeparada[3]);
        }
        System.out.println("O total da sua compra é " + soma);
    }
}
