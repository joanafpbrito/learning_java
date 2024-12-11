import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();
        System.out.println("Introduza outro número: ");
        num2 = input.nextInt();
        System.out.println("Introduza mais um número: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        }
        if (num3 < num2 && num3 < num1) {
            System.out.println(num3);
        }
    }
}
