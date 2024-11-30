package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        System.out.println("Insira o ano:");
        year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println("É um ano bissexto!");
        } else {
            System.out.println("É um ano comum!");
        }
    }
}
