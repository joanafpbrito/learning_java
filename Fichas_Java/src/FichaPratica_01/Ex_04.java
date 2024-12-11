package FichaPratica_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area, pi;

        pi = 3.1415;

        System.out.print("Introduza o raio da circunferência: ");
        raio = input.nextDouble();

        area = raio * pi;

        System.out.print("A área da cinrcunferência é " + area + ".");
    }
}

