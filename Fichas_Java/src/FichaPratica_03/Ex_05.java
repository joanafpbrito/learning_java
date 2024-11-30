package FichaPratica_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int num2 = 1;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        while (num2 <= num) {
            System.out.println("Adoro programação");
            num2 = num2 + 1;
        }
    }
}
