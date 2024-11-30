package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_02Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = 0, moonWeight;

        while (weight <= 0) {
            System.out.println("Introduza o seu peso:");
            weight = input.nextDouble();
            if (weight > 0) {
                moonWeight = weight*0.16;
                System.out.println("O seu peso na Lua seria: " + moonWeight);
            }
        }
    }
}
