package FichaPrática_07;

import java.io.*;
import java.util.Scanner;

public class biblioteca {
    /**
     * função para ler e imprimir na consola o ex1
     * @throws FileNotFoundException
     */
    public static void usingScanner() throws FileNotFoundException {
        File ex1 = new File("files/exercicio_01.txt");
        Scanner sc = new Scanner(ex1);

        System.out.println(sc.nextLine());
    }

    /**
     * função para ler na consola qualquer ficheiro
     * @param caminho espera o caminho do ficheiro
     * @throws FileNotFoundException
     */
    public static void usingScanner2(String caminho) throws FileNotFoundException {
        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        while ( sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    /**
     * função que cria um ficheiro e manda para lá conteúdo
     * @param path caminho para o novo ficheiro
     * @param content conteúdo do ficheiro
     * @throws FileNotFoundException
     */
    public static void usingPrintWriter(String path, String content) throws FileNotFoundException {
        File newFile = new File(path);
        PrintWriter newPrint = new PrintWriter(newFile);

        newPrint.println(content);

        newPrint.close();
    }

    /**
     * função que copia o conteúdo de um ficheiro e cola noutro
     * @param pathCopy caminho do ficheiro a copiar
     * @param pathPaste caminho do ficheiro a substituir
     * @throws FileNotFoundException
     */
    public static void copyFile ( String pathCopy, String pathPaste) throws FileNotFoundException {
        File file = new File(pathCopy);
        Scanner sc = new Scanner(file);
        File newFile = new File(pathPaste);
        PrintWriter newPrint = new PrintWriter(newFile);

        while ( sc.hasNextLine()) {
            newPrint.println(sc.nextLine());
        }

        newPrint.close();

    }

    /**
     * função que copia um conteúdo de um ficheiro para outro, sem eliminar o conteúdo prévio
     * @param pathCopy caminho do ficheiro a copiar
     * @param pathPaste caminho do ficheiro que vai receber novo conteúdo
     * @throws IOException
     */
    public static void copyFile2 ( String pathCopy, String pathPaste) throws IOException {
        File file = new File(pathCopy);
        Scanner sc = new Scanner(file);
        File newFile = new File(pathPaste);
        FileWriter newPrint = new FileWriter(newFile, true);

        while ( sc.hasNextLine()) {
            newPrint.append(sc.nextLine());
        }

        newPrint.close();

    }

    public static void dividirArray (String path, String separator) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){

            String line = sc.nextLine();
            String[] lineSplit = line.split(separator);

            for(int i =0; i< lineSplit.length;i++) {
                System.out.print(lineSplit[i] + "\t|\t");
            }
            System.out.println();
        }
    }


    // ex 9 FUNÇÕES

    /**função para pesquisar por genero musical no ficheiro
     *
     * @param path caminho do ficheiro
     * @param op o estilo pedido pelo utilizador
     * @throws FileNotFoundException
     */
    public static void searchGen(String path, String op) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (linhaSeparada[2].toUpperCase().equals(op)  ) {
                System.out.println(linhaSeparada[0] + " - " + linhaSeparada[1]);
            }
        }
    }

    /**
     * função para pesquisar por artista
     * @param path caminho do ficheiro
     * @param artist input do utilizador
     * @throws FileNotFoundException
     */
    public static void searchArt(String path, String artist) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            if (linhaSeparada[1].toUpperCase().equals(artist)  ) {
                System.out.println(linhaSeparada[0] + " - " + linhaSeparada[1]);
            }
        }
    }

    /**
     * função que lê a musica mais curta numa playlist
     * @param path
     * @throws FileNotFoundException
     */
    public static void Smaller(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int smaller = 999999;
        String music = "";

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");
            String[] time = linhaSeparada[3].split(":");
            int seconds = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);

            if (smaller > seconds) {
                smaller = seconds;
                music = "A música mais curta é " + linhaSeparada[0] + " - " + linhaSeparada[1];
            }

           //ciclo a passar por todos. sempre que passa multiplica o valor dentro da posição 0 por 60 e soma à posição 1
            // variavel x que guarda o primeiro resultado e depois adquire o valor se inferior
        } System.out.println(music);
    }

    /**
     * função que lê a música mais longa na playlist
     * @param path caminho da playlist
     * @throws FileNotFoundException
     */
    public static void Bigger(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int bigger = 0;
        String music = "";

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");
            String[] time = linhaSeparada[3].split(":");
            int seconds = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);

            if (bigger < seconds) {
                bigger = seconds;
                music = "A música mais longa é " + linhaSeparada[0] + " - " + linhaSeparada[1];
            }

        } System.out.println(music);
    }

    /**
     * função que imprime todas as músicas superiores a determinado tamanho em segundos que o utilizador dá
     * @param path
     * @param limit
     * @throws FileNotFoundException
     */
    public static void BiggerThan(String path, int limit) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int bigger = 0;
        String music = "";

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");
            String[] time = linhaSeparada[3].split(":");
            int seconds = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);

            if (limit < seconds) {
                System.out.println(linhaSeparada[0] + " - " + linhaSeparada[1]);
            }
        }
    }


    public static void howMany(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        int count = 0;

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            count++;
        }
        System.out.println("Tem " + count + " músicas na sua playlist");
    }

}


