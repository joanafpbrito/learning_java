package cine;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import static cine.menu_library.readFile;


public class client_library {
    /**
     * registers new user account
     */
    public static void registerNewUser() {
        Scanner input = new Scanner(System.in);

        String name = "";
        String email = "";
        String pass = "";
        String pass2 = "";

        System.out.println("___________________________________");
        System.out.println("*.*.*.*.*Insert Name:*.*.*.*.*");
        name = input.next();
        System.out.println("___________________________________");
        System.out.println("*.*.*.*.*Insert E-Mail:*.*.*.*.*");
        email = input.next();
        System.out.println("___________________________________");
        System.out.println("*.*.*.*.*Insert Password:*.*.*.*.*");
        pass = input.next();
        System.out.println("___________________________________");
        do {
            System.out.println("*.*.*.*.*Confirm Password:*.*.*.*.*");
            pass2 = input.next();
            System.out.println("___________________________________");

        } while (!pass2.equals(pass));
    }

    /**
     * prints a new menu to read different files using the readFile function
     *
     * @throws FileNotFoundException
     */
    public static void graphicMenu() throws FileNotFoundException {
        int option = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("*.*.*.*.*Select your option:*.*.*.*.*");
        System.out.println("1. Harry Potter");
        System.out.println("2. Interstellar");
        System.out.println("3. Lord of the Rings");
        System.out.println("4. StarWars");
        option = input.nextInt();

        switch (option) {
            case 1:
                readFile("src/Files/IMDV/CatalogoGrafico/HarryPotter.txt");
                break;
            case 2:
                readFile("src/Files/IMDV/CatalogoGrafico/Interstellar.txt");
                break;
            case 3:
                readFile("src/Files/IMDV/CatalogoGrafico/LordOfTheRings.txt");
                break;
            case 4:
                readFile("src/Files/IMDV/CatalogoGrafico/StarWars.txt");
                break;
        }
    }

    /**
     * returns the average rating of a given studio
     *
     * @param path   path file
     * @param studio studio chosen by user
     * @throws FileNotFoundException
     */
    public static double studioRates(String path, String studio) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        double result = 0.0;
        int count = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitedLine = line.split(";");

            if (splitedLine[5].equals(studio)) {
                result += Double.parseDouble(splitedLine[2]);
                count++;
            }
        }
        result = result / count;
        return result;
    }

    /**
     * lists all studios no repeats
     * @param path file path
     * @return String[] of studios
     * @throws FileNotFoundException
     */
    public static String[] tStudios ( String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        int count = 0;
        String[] studios = new String[1000];
        boolean same = false;

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
        return studios;
    }


// after managing to implement the loop in the administrator's library, tried to bring it here and rework the two bibles that follow For that I created the function above, identical to the one in the administrator, but it returns a String[] with the studios instead of printing to the console
// depois de conseguir (com muuuuito esforço) implementar o ciclo na libraria do administrador (função totalStudios), tentei trazer para aqui e refazer as duas biblias que estão a seguir, para isso criei a função em cima praticamente igual a do administrador, mas retorna a string[] com os estudios em vez de um print na consola
// I also remake the code to test the doubts I mencioned in the other library, it works more eficiently here but I don't want to change in the other file to have some structure for reference in future
// também reformulei o código para testar as dúvidas dque mencionei na função da libraria do administrador. Não é realmente necessário dar valor ao array em primeira instância, , mas não quis ir apagar para poder ficar de consulta para o futuro
    /**
     * gives the best average rate studio
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void better(String path) throws FileNotFoundException {

        String finalStudio = tStudios(path)[0];
        double finalMedia = studioRates(path, tStudios(path)[0]);

        for (int i = 1; i < tStudios(path).length; i++) {
            double media = studioRates(path, tStudios(path)[i]);
            String studio = tStudios(path)[i];

            if (finalMedia < media) {
                finalMedia = media;
                finalStudio = studio;
            }
        }
        System.out.println("The best average rating Studio is " + finalStudio + " with " + finalMedia + " points!");
    }

    /**
     * gives teh worse average rate studios
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void worse(String path) throws FileNotFoundException {

        String finalStudio = tStudios(path)[0];
        double finalMedia = studioRates(path, tStudios(path)[0]);

        for (int i = 1; i < tStudios(path).length; i++) {
            double media = studioRates(path, tStudios(path)[i]);
            String studio = tStudios(path)[i];

            if (finalMedia > media) {
                finalMedia = media;
                finalStudio = studio;
            }
        }
        System.out.println("The worst average rating Studio is " + finalStudio + " with " + finalMedia + " points!");
    }

                // acabei por conseguir , portanto as duas função que se seguem nao estao a ser utilizadas em nenhum lado no projeto
    //tentei fazer um ciclo para que sempre que a splited line na posição 5 fosse diferente das anteriores guardar num novo array,
    //mas nao conseguia instanciar o array sem o total de posiçoes, e ia dar ao mesmo, tinha de avaliar uma a uma à mão
    //a ideia era a seguir a guardar no array, um novo ciclo que para cada posição desse array usar a função studioRates e depois fazer a condição igual para perceber a mais alta e a mais baixa
    // MAS não consegui implementar, então nas próximas duas funções está uma bíblia de repetições, a única coisa que muda é o nome do estúdio

    /**
     * uses the function above to calculate the average rating for each studio and returns the highest
     *
     * @throws FileNotFoundException
     */
    public static void betterStudio() throws FileNotFoundException {
        String studio = "Legendary Pictures";
        double media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        String finalStudio = studio;
        double finalMedia = media;
        studio = "Lionsgate";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Warner Bros";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "New Line Cinema";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Columbia Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "20th Century Fox";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Miramax Films";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Paramount Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Universal Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "DreamWorks";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Marvel Studios";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "The Weinstein Company";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Walt Disney Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Orion Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Syncopy Inc.";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Black Label Media";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "United Artists";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Touchstone Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Avco Embassy Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Pixar Animation Studios";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "FilmNation Entertainment";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Temple Hill Entertainment";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Phoenix Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Mattel Films";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Village Roadshow Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia < media) {
            finalMedia = media;
            finalStudio = studio;
        }

        System.out.println("The best average rating Studio is " + finalStudio + " with " + finalMedia + " points!");

    }

    /**
     * same as betterStudio, but returns the worse average rating
     *
     * @throws FileNotFoundException
     */
    public static void worseStudio() throws FileNotFoundException {
        String studio = "Legendary Pictures";
        double media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        String finalStudio = studio;
        double finalMedia = media;
        studio = "Lionsgate";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Warner Bros";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "New Line Cinema";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Columbia Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "20th Century Fox";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Miramax Films";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Paramount Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Universal Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "DreamWorks";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Marvel Studios";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "The Weinstein Company";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Walt Disney Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Orion Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Syncopy Inc.";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Black Label Media";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "United Artists";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Touchstone Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Avco Embassy Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Pixar Animation Studios";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "FilmNation Entertainment";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Temple Hill Entertainment";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Phoenix Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Mattel Films";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }
        studio = "Village Roadshow Pictures";
        media = studioRates("src/Files/IMDV/IMDV.csv", studio);
        if (finalMedia > media) {
            finalMedia = media;
            finalStudio = studio;
        }

        System.out.println("The worst average rating Studio is " + finalStudio + " with " + finalMedia + " points!");

    }

    /**
     * prints latest entrie in file
     * @param path file path
     * @throws FileNotFoundException
     */
    public static void latestEntrie(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        while (sc.hasNextLine()){
            line = sc.nextLine();
        }
        System.out.println(line);
    }

    // precisei de mudar o ficheiro quiz para um novo, porque dava erro "The file was loaded in a wrong encoding: UTF-8"

    /**
     * quiz function, presenting menu, options and performance evaluation message
     * @throws FileNotFoundException
     */
    public static void quiz() throws FileNotFoundException {
        File file = new File("src/Files/IMDV/Quiz.csv");
        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String line = sc.nextLine();
        int answer;
        int count = 0;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitedLine = line.split(";");
            System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
            System.out.println(splitedLine[0]);
            System.out.println("Option 1. " + splitedLine[1]);
            System.out.println("Option 2. " + splitedLine[2]);
            System.out.println("Option 3. " + splitedLine[3]);
            System.out.println("Option 4. " + splitedLine[4]);
            answer = input.nextInt();

            if (answer == Integer.parseInt(splitedLine[5])) {
                System.out.println("Correct answer!");
                System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                count++;
            } else {
                System.out.println("Wrong answer!");
                System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
            }
        }
        switch (count) {
            case 5:
                System.out.println("Congratulations, you nailed it!");
                break;
            case 4:
                System.out.println("Congratulations, you're almost there!");
                break;
            case 3, 2:
                System.out.println("You're half way!");
                break;
            case 1, 0:
                System.out.println("Too bad, you need to watch the movies again!");
                break;
        }
}

    /**
     * prints the film catalogue by production studio
     * @param path file path
     * @param studio studio chosen by user
     * @throws FileNotFoundException
     */
    public static void searchStudio (String path, String studio) throws FileNotFoundException {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            while (sc.hasNextLine()){
                line = sc.nextLine();
                String[] splitedLine = line.split(";");

                if (splitedLine[5].toUpperCase().equals(studio)  ) {
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println(splitedLine[1] + " - " + splitedLine[7]);
                }
            }
    }

    /**
     * prints film catalogue by type
     * @param path file path
     * @param type type chosen by user
     * @throws FileNotFoundException
     */
    public static void searchType(String path, String type) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        while (sc.hasNextLine()){
            line = sc.nextLine();
            String[] splitedLine = line.split(";");

            if (splitedLine[7].toUpperCase().equals(type)  ) {
                System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                System.out.println(splitedLine[1] + " - " + splitedLine[5]);
            }
        }

    }
}
