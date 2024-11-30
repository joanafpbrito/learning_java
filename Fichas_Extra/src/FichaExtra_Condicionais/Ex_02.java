package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, moonWeight;

        System.out.println("Introduza o seu peso:");
        weight = input.nextDouble();

        if (weight > 0) {
            moonWeight = weight*0.16;
            System.out.println("O seu peso na Lua seria: " + moonWeight);
        } else {
            System.out.println("Introduza o seu peso real:"); // aqui fariamos um while para continuar até introduzir um peso real
        }

    }
}
