package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Introduza a sua idade:");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
