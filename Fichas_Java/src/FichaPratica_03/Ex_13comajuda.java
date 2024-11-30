package FichaPratica_03;

import java.util.Scanner;

public class Ex_13comajuda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();

        while ( num1 <= num2) {
            if (num1 % 5 == 0) {
                System.out.println(num1);
            }
            num1 = num1 + 1;
        }
    }
}
