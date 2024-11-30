package FichaPratica_03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, num2;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        num2 = num - 5;

        while (num2 < num) {
            System.out.println(num2);
            num2 = num2 + 1;
        }

        num2 = num + 5;
        num = num + 1;

        while (num <= num2) {
            System.out.println(num);
            num = num + 1;
        }

        // num2 = num - 5;
        // while ( num2 <= num + 5) {
        //   if ( num2 != num ) {
        //      System.out.println(num);
        //      num = num + 1;
    }
}
