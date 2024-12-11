package FichaPratica_04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, total;
        String operator;
        String again = "s";
        boolean a = true;

        do {
            System.out.println("Introduza um número:");
            num1 = input.nextInt();
            System.out.println("Introduza a operação:");
            operator = input.next();
            System.out.println("Introduza outro número:");
            num2 = input.nextInt();

            switch (operator) {
                case "+":
                    total = num1 + num2;
                    System.out.println(total);
                    break;
                case "-":
                    total = num1 - num2;
                    System.out.println(total);
                    break;
                case "*":
                    total = num1 * num2;
                    System.out.println(total);
                    break;
                case "/":
                    total = num1 / num2;
                    System.out.println(total);
                    break;
            }
            System.out.println("Deseja fazer outra operação? Introduza s/n");
            again = input.next();
            switch (again) {
                case "s":
                    a = true;
                    break;
                case "n":
                    a = false;
                    break;
            }
        } while (a);
    }
}

