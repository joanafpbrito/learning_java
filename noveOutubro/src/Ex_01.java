import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Introduza um número:");
        num1 = input.nextInt();

        System.out.println("Introduza outro número:");
        num2 = input.nextInt();

        num3 = num1 + num2;
        System.out.println("A soma é " + num3);
    }
}
