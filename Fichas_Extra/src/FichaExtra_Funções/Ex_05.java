package FichaExtra_Funções;

import java.util.Scanner;

import static FichaExtra_Funções.Ex_00_Biblioteca.veryFunny;

public class Ex_05 {
    public static void main(String[] args) {
        int numUser;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número:");
        numUser = input.nextInt();

        System.out.println(veryFunny(numUser));
    }
}
