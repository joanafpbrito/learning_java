package cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static cine.menu_library.*;
import static java.lang.Integer.*;

public class admin_library {
    /**
     * checks if username and passwords are correct and proceeds to admin menu if positive
     *
     * @throws FileNotFoundException
     */
    public static void login() throws IOException {
        File file = new File("src/Files/IMDV/IMDV_AdminLogin.csv");
        Scanner sc = new Scanner(file);
        Scanner imput = new Scanner(System.in);
        String line = sc.nextLine();
        String userName;
        String password;
        boolean confirmUser = false;

        System.out.println("___________________________________");
        System.out.println("*.*.*.*.*Insert Username:*.*.*.*.*");
        userName = imput.next();
        System.out.println("___________________________________");
        System.out.println("*.*.*.*.*Insert Password:*.*.*.*.*");
        password = imput.next();

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitedLine = line.split(";");

            if (splitedLine[0].equals(userName) && splitedLine[1].equals(password)) {
                confirmUser = true;
            }
        }
        if (confirmUser) {
            readFile("src/Files/IMDV/CatalogoGrafico/welcome.txt");
            System.out.println("__        __   _                          \n" +
                    "\\ \\      / /__| | ___ ___  _ __ ___   ___ \n" +
                    " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\\n" +
                    "  \\ V  V /  __/ | (_| (_) | | | | | |  __/\n" +
                    "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|");
            System.out.println(" Sir, " + userName + "!");
            fiveSpaces();
            adminMenu();
        } else {
            System.out.println("Username or password does not match!");
        }
    }

    public static int totalEntries(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        int count = 0;

        while (sc.hasNextLine()) {
            count++;
        }
        return count;
    }

    /**
     * prints all the studios available in the file no repeats
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void totalStudios(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        int count = 0;
        String[] studios = new String[1000];
        boolean same = false;
// here I started the first line after header in order to give value to the new array index 0. I don't really know if it was necessary to initialize the array in first place
// aqui chamei a primeira linha do ficheiro depois do cabecalho, para poder dar um valor ao array novo na posiçao 0
        if (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitedLine = line.split(";");
            studios[0] = splitedLine[5];
            count++;
        }
//only here started the cicle
// e só aqui é que iniciei o ciclo
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitedLine = line.split(";");

            for (int i = 0; i < count; i++) {
                if (studios[i].equals(splitedLine[5])) {
                    same = true;
                    break;
                } else {
                    same = false;
                }
            }
            if (!same) {
                studios[count] = splitedLine[5];
                count++;
            }
        }
// here, I printed new array instead of printing along the way inside the cicle when condition false
// aqui imprimi o array novo completo numerado em vez de imprimir dentro do ciclo
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". "+ studios[i]);
        }
    }

    /**
     * appends new entry on file
     * @param path file path
     * @param newContent teh content that will be appended to the file
     * @throws IOException
     */
    public static void addNew(String path, String newContent) throws IOException {
        FileWriter fw = new FileWriter(path, true);
        fw.append(newContent);
        fw.close();

    }

    /**
     * form that saves the user input to add new entry on movie list file
     * @param path file path
     * @return a string separated with ";" with different data from movie
     * @throws FileNotFoundException
     */
    public static String newEntry (String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        //auto incremento do splitedline[0] split the split 0 por hifen, integer parse cenas do split 1 , incrementa
        while (sc.hasNextLine()) {
            line = sc.nextLine();
        }

        String[] splitedLine = line.split(";");
        String[] splitedId = splitedLine[0].split("-");

        int id = Integer.parseInt(splitedId[1]) + 1;
        String idFilme = (splitedId[0] + "-" + id);

        System.out.println("** Movie Name: **");
        String name = input.next();
        System.out.println("** Movie Rating: **");
        input.nextLine();
        String rating = input.next();
        System.out.println("** Movie Time: **");
        String time = input.next();
        System.out.println("** Movie year: **");
        String year = input.next();
        System.out.println("** Movie Studio: **");
        String studio = input.next();
        System.out.println("** Movie Director: **");
        input.nextLine();
        String director = input.next();
        System.out.println("** Movie Genre: **");
        input.nextLine();
        String genre = input.next();

        String content = (idFilme + ";" + name + ";" + rating + ";" + time + ";" + year + ";" +studio + ";" +director + ";" + genre + "\n" );
        return content;
    }
}



