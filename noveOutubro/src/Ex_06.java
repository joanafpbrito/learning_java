import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, sub;
        System.out.println("Introduza o primeiro valor:");
        valor1 = input.nextInt();
        System.out.println("Introduza o segundo valor:");
        valor2 = input.nextInt();

        System.out.println(valor1 + ", " + valor2);
        sub= valor1;
        valor1=valor2;
        valor2= sub;
        System.out.println("A trocar as variáveis...");
        System.out.println(valor1 + ", " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;
        System.out.println("A trocar as variáveis...");
        System.out.println(valor1 + ", " + valor2);
    }
}
