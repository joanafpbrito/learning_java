import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O seu número é par!");
        } else {
            System.out.println("O seu número é ímpar!");
        }
    }
}
