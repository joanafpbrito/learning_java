package FichaPrática_07;
import java.io.FileNotFoundException;
import static FichaPrática_07.biblioteca.dividirArray;
import static FichaPrática_07.biblioteca.usingScanner2;

public class Ex_04 {
    public static void main(String[] args) throws FileNotFoundException {
         String path = "files/exercicio_04.csv";
         String separator = ";";
         dividirArray(path, separator);



    }
}
