import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1, nota2, nota3;
        double mediaPo;
        System.out.println("Introduza primeira nota: ");
        nota1 = input.nextInt();
        System.out.println("Introduza segunda nota: ");
        nota2 = input.nextInt();
        System.out.println("Introduza terceira nota: ");
        nota3 = input.nextInt();

        mediaPo = (nota1*0.25) + (nota2*0.35) + (nota3*0.40);

        if (mediaPo > 9.5) {
            System.out.println("Está aprovado!");
        } else {
            System.out.println("Tente outra vez!");
        }

    }
}
