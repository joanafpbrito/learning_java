package FichaPratica_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, limite;

        System.out.println("Introduza um número: ");
        limite = input.nextInt();

        while (num <= limite) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
