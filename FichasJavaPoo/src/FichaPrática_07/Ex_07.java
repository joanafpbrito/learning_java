package FichaPrática_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

// ver se tem next, scan next associar um contador ++ dois contadores. uma para linhas e outro para palavras

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("files/exercicio_07.txt"));
        Scanner sc1 = new Scanner(new File("files/exercicio_07.txt" ));
        int count = 0;
        int count1 = 0;


        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            count ++;
        }

        while (sc1.hasNext()) {
            String word = sc1.next();
            count1 ++;
        }

        System.out.println("O seu ficheiro tem " + count + " linhas e " + count1 + " palavras!" );
    }
}
