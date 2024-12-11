package FichaPratica_02;

import java.util.Scanner;

public class Ex_06 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int num1, num2;

            System.out.print ("Insira numero 1: ");
            num1 = input.nextInt();

            System.out.print ("Insira numero 2: ");
            num2 = input.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
}
