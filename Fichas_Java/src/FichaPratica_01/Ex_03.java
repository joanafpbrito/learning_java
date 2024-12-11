package FichaPratica_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largura, comprimento, area, perimetro;

        System.out.print("Introduza a largura do retângulo: ");
        largura = input.nextDouble();
        System.out.print("Introduza o comprimento do retângulo: ");
        comprimento = input.nextDouble();

        area = largura * comprimento;
        perimetro = largura * 2 + comprimento * 2;

        System.out.println( "A área do retângulo é " + area + ";");
        System.out.print( "O perímetro do retângulo é " + perimetro + ".");


    }
}


