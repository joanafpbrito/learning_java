package cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static cine.admin_library.*;
import static cine.client_library.*;


public class menu_library {

     /**
     * prints 10 spaces
     */
    public static void tenSpaces () {
    for (int i=0; i<10; i++) {
        System.out.println("");
    }
}
    /** prints 5 spaces
     *
     */
    public static void fiveSpaces () {
        for (int i=0; i<5; i++) {
            System.out.println("");
        }
    }
    /**
     * awaits enter to proceed and then prints 10 spaces with function tenSpaces
     */
    public static void proceed () {
        Scanner input = new Scanner(System.in);
        input.nextLine(); // call for enter to proceed
        tenSpaces();
    }
    /**
     * creates new copyright to end program
     * @throws FileNotFoundException
     */
    public static void createNewCopyright() throws FileNotFoundException {
        String path = "src/Files/IMDV/new_copyright.txt";
        String content =
                "  (¯`·.¸¸.·´¯`·.¸¸.·´¯)\n" +
                "  ( \\                 / )\n" +
                " ( \\ )   Film Gang   ( / )\n" +
                "( ) (        by       ) ( )\n" +
                " ( / )  Joana Brito  ( \\ )\n" +
                "  ( /                 \\ )\n" +
                "   (_.·´¯`·.¸¸.·´¯`·.¸_)";
        File newFile = new File(path);
        PrintWriter newCopyright = new PrintWriter(newFile);

        newCopyright.println(content);
        newCopyright.close();

       // readFile(path);
        // first I was calling this function on the menus, but I realised it was not necessary everytime create a new file with same path and content. so I changed and called function readfile on teh menu with the path of the file this function created

    }
    /**
     * print complete file with a separator * line
     *
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void readFileWithSeparator(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
            System.out.println(sc.nextLine());
        }
    }
    /**
     * print complete file
     *
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
    /**
     * first menu to distinguish roles
     */
    public static void firstMenu () throws IOException {
        String option;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("*.*.*.*.*Choose type of User*.*.*.*.*");
            System.out.println("ADMIN || COSTUMER");
            option = input.next().toUpperCase().trim();

            switch (option) {
                case "ADMIN":
                    login();
                    break;
                case "COSTUMER":
                    clientMenu();
                    break;
            }
        } while (!option.equals("ADMIN") && !option.equals("COSTUMER"));
    }
    /**
     * print costumer menu and deal with user inputs
     */
    public static void clientMenu () throws FileNotFoundException {
        String path = "src/Files/IMDV/IMDV.csv";
        int option = 0;
        Scanner input = new Scanner(System.in);

        while (option == 0) {
        System.out.println("*.*.*.*.*Select your option:*.*.*.*.*");
        System.out.println("1. New around here? Create your account");
        System.out.println("2. Check full Catalog");
        System.out.println("3. Check InfoGraphics");
        System.out.println("4. Check the best Production Studio");
        System.out.println("5. Check the worst Production Studio");
        System.out.println("6. Check latest Review");
        System.out.println("7. Check your knowledge, start the Quiz");
        System.out.println("8. Check full catalog by Production Studio");
        System.out.println("9. Check full catalog by Type");
        System.out.println("10. Exit");
        option = input.nextInt();

        switch (option) {
            case 1:
                    registerNewUser();
                    proceed();
                    option=0;
                    break;
            case 2:
                    readFileWithSeparator(path);
                    proceed();
                    option=0;
                    break;
            case 3:
                    graphicMenu();
                    proceed();
                    option=0;
                    break;
            case 4:
                    better(path);
                    proceed();
                    option=0;
                    break;
            case 5:
                    worse(path);
                    proceed();
                    option=0;
                    break;
            case 6:
                    latestEntrie(path);
                    proceed();
                    option=0;
                    break;
            case 7:
                    quiz();
                    proceed();
                    option=0;
                    break;
            case 8:
                    System.out.println("*.*.*.*.*Which studio are you interested in?*.*.*.*.*");
                    input.nextLine(); // without this there was trouble with more than one word studio names
                    String op = input.nextLine().toUpperCase();
                    searchStudio(path, op);
                    proceed();
                    option=0;
                    break;
            case 9:
                    System.out.println("*.*.*.*.*Which type you like most?*.*.*.*.*");
                    input.nextLine();
                    String opt = input.nextLine().toUpperCase();
                    searchType(path, opt);
                    proceed();
                    option=0;
                    break;
            case 10:
                    System.out.println("*.*.*.*.*Goodbye*.*.*.*.*");
                    readFile("src/Files/IMDV/new_copyright.txt");
                    break;
        }
    }
}
    /**
     * print admin menu and deal with the inputs
     */
    public static void adminMenu () throws IOException {
        Scanner input = new Scanner(System.in);
        int option = 0;

        String path = "src/Files/IMDV/IMDV.csv";

        while (option == 0) {
            System.out.println("*.*.*.*.*Select your option:*.*.*.*.*");
            System.out.println("1. Check Files");
            System.out.println("2. Total entries");
            System.out.println("3. List Production Studios");
            System.out.println("4. Add New Entrie");
            System.out.println("5. Exit");

            option = input.nextInt();

            switch (option) {
                case 1:
                    readFileWithSeparator(path);
                    proceed();
                    option=0;
                    break;
                case 2:
                    int total = totalEntries(path);
                    System.out.println("You have " + total + " entries!" );
                    proceed();
                    option=0;
                    break;
                case 3:
                    totalStudios(path);
                    proceed();
                    option=0;
                    break;
                case 4:
                    String content = newEntry(path);
                    addNew(path, content);
                    proceed();
                    option=0;
                    break;
                case 5:
                    System.out.println("*.*.*.*.*Goodbye*.*.*.*.*");
                    readFile("src/Files/IMDV/new_copyright.txt");
                    break;

            }
        }
    }



}
