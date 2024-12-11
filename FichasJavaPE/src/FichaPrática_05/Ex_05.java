package FichaPrática_05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] armario = new double [10];
        double media=0;
        for ( int i=0; i < armario.length; i++) {
            System.out.println("Introduza o valor que quer guardar: ");
            armario[i]= input.nextInt();
            media = media + armario[i];
        }
        media = (media / armario.length);

        System.out.println("A média é " + media);
    }
}
