package TheWayWeMove;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{


    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100Km) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100Km);
    }

    public void imagem () throws FileNotFoundException {
        File newFile = new File("files/Mota.txt");
        Scanner sc = new Scanner(newFile);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
