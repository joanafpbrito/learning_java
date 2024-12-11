package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 30, num2;

        System.out.println("Adivinha o número:");
        num2= input.nextInt();

        if (num2 == num) {
            System.out.println("Muito bem. Acertaste!");
        }
        if (num2 < num) {
            System.out.println("Muito baixo!");

            System.out.println("Tenta outra vez:");
            num2= input.nextInt();

            if (num2 == num) {
                System.out.println("Muito bem. Acertaste!");
            }
            if (num2 < num) {
                System.out.println("Muito baixo!");
                System.out.println("Ficaste sem tentativas!");
            }
            if (num2 > num) {
                System.out.println("Muito alto!");
                System.out.println("Ficaste sem tentativas!");
            }
        } else {
            System.out.println("Muito alto!");

            System.out.println("Tenta outra vez:");
            num2= input.nextInt();

            if (num2 == num) {
                System.out.println("Muito bem. Acertaste!");
            }
            if (num2 < num) {
                System.out.println("Muito baixo!");
                System.out.println("Ficaste sem tentativas!");
            }
            if (num2 > num) {
                System.out.println("Muito alto!");
                System.out.println("Ficaste sem tentativas!");
            }
        }
    }
}
