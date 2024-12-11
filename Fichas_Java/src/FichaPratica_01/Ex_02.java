package FichaPratica_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, mais, menos, vezes, dividir;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        mais = num1 + num2;
        menos = num1 - num2;
        vezes = num1 * num2;
        dividir = num1 / num2;

        //  System.out.println("O resultado da soma dos dois números é " + mais + "!");
        //  System.out.println("O resultado da subtração dos dois números é " + menos + "!");
        //  System.out.println("O resultado da multiplicação dos dois números é " + vezes + "!");
        //  System.out.println("O resultado da divisão dos dois números é " + dividir + "!");))

        System.out.println( num1 + " + " + num2 + " = " + mais);
        System.out.println( num1 + " - " + num2 + " = " + menos);
        System.out.println( num1 + " x " + num2 + " = " + vezes);
        System.out.println( num1 + " / " + num2 + " = " + dividir);

    }
}


