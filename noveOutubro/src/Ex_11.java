import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Qual o seu salário anual?");
        salario = input.nextDouble();

        if (salario <=15000) {
            imposto = salario* 0.20;
            System.out.println("O imposto é 20%, irá pagar " + imposto);
        }
        if (salario > 15000 && salario <= 20000) {
            imposto = salario* 0.30;
            System.out.println("O imposto é 30%, irá pagar " + imposto);
        }
        if (salario > 20000 && salario <= 25000) {
            imposto = salario* 0.35;
            System.out.println("O imposto é 35%, irá pagar " + imposto);
        }
        if (salario >25000) {
            imposto = salario * 0.40;
            System.out.println("O imposto é 40%, irá pagar " + imposto);
        }
    }
}
