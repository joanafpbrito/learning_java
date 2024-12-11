package FichaPrática_05;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] primeira = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduza o valor do vector[" + i + "]:");
            primeira[i]= input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]:" + primeira[i]);
        }
    }
}
