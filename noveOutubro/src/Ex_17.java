import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, total;
        String operacao;

        System.out.println("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.println("Introduza outro número: ");
        num2 = input.nextDouble();
        System.out.println("Introduza a operação que pretende:");
        operacao = input.next();

        switch (operacao) {
            case "+":
                total = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + total);
                break;
            case "-":
                total = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + total);
                break;
            case "*":
                total = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + total);
                break;
            case "/":
                total = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + total);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}
