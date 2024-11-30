package FichaPrática_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPrática_07.biblioteca.*;

public class Ex_09 {
    public static void main(String[] args) throws FileNotFoundException {
        dividirArray("files/exercicio_09.csv", ",");
        Scanner input = new Scanner(System.in);

        int option = 1;
        while (option == 1) {
            System.out.println("***Escolha uma opção: ***");
            System.out.println("0. Sair");
            System.out.println("2. Pesquisar por género");
            System.out.println("3. Pesquisar por artista");
            System.out.println("4. Menor música");
            System.out.println("5. Maior música");
            System.out.println("6. Música maior que...");
            System.out.println("7. Quantas músicas tens na playlist");
            option = input.nextInt();
            String op = "";
            switch (option) {
                case 2:
                    System.out.println("***Escolha uma opção: ***");
                    System.out.println("ROCK");
                    System.out.println("POP");
                    System.out.println("ALTERNATIVE ROCK ");
                    System.out.println("PSYCHADELIC ROCK");
                    System.out.println("FOLK");
                    System.out.println("HEAVY METAL");
                    System.out.println("GRUNGE");
                    op = input.next();
                    op = op.toUpperCase();
                    // System.out.println(op);
                    // ir fazer uma fucking função com parametro op
                    // ler o ficheiro, dividir em array, op == a array na posição 2, se sim sout
                    searchGen("files/exercicio_09.csv", op);

                    option = 1;
                    break;

                case 3:

                    System.out.println("***Escolha um artista: ***");
                    op = input.next();
                    op = op.toUpperCase();
                    searchArt("files/exercicio_09.csv", op);

                    option = 1;
                    break;

                case 4: Smaller("files/exercicio_09.csv");

                    option = 1;
                    break;

                case 5: Bigger("files/exercicio_09.csv");

                    option = 1;
                    break;

                case 6:
                    System.out.println("Música maiores do que...");
                    int time = input.nextInt();
                    BiggerThan("files/exercicio_09.csv", time);

                    option = 1;
                    break;

                case 7:
                    howMany("files/exercicio_09.csv");

                    option = 1;
                    break;

                default:
                    System.out.println("** Até breve **");
            }
        }
    }
}
