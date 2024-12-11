import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, total;

        System.out.println("Introduza um número:");
        num1 = input.nextInt();

        System.out.println("Introduza um número:");
        num2 = input.nextInt();

        total= num1 + num2;
        System.out.println("A soma é " + total);

        total= num1 - num2;
        System.out.println("A subtração é " + total);

        total= num1 * num2;
        System.out.println("A multiplicação é " + total);

        total= num1 / num2;
        System.out.println("A divisão é " + total);
    }
}
