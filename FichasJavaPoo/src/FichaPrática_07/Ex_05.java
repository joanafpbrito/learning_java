package FichaPrática_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/exercicio_05_31.txt");
        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        String[] lineSplit = line.split(" ");
        double soma = 0;
        for (int i = 0; i < lineSplit.length; i++) {
            soma += Double.parseDouble(lineSplit[i]);
        }

        for (int i = 0; i < lineSplit.length; i++) {
            System.out.print( "| |" + lineSplit[i]);
        }
        System.out.println("| |\n\n" );

        System.out.println("A soma de todos os números é " + soma);



    }
}
