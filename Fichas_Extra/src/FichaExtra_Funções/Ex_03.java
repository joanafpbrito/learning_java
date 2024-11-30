package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.areaRetangulo;

public class Ex_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double largura, comprimento, area;
        System.out.println("Introduza a largura do seu rectângulo:");
        largura = input.nextDouble();
        System.out.println("Introduza o comprimento do seu rectângulo:");
        comprimento = input.nextDouble();

        area = areaRetangulo(largura,comprimento);

        System.out.println("A área do seu rectângulo é " + area);
    }
}
