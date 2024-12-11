package FichaPratica_03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, num2;
        num2 = 2;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        while (num2 <= num ) {
            System.out.println(num2);
            num2 = num2 + 2;
        }
    }
}

