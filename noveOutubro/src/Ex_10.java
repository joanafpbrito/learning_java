import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Qual o seu salário anual?");
        salario = input.nextDouble();

        if (salario <= 15000) {
            imposto = salario*0.20;
            System.out.println("O imposto a pagar é de " + imposto);
        } else {
            imposto = salario*0.30;
            System.out.println("O imposto a pagar é de " + imposto);
        }

    }
}
