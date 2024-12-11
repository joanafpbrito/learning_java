import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, pi = 3.14, area;

        System.out.println("Introduza o raio da circunferência:");
        raio = input.nextDouble();

        area = pi * (raio * raio);

        System.out.println("A área da sua circunferência é " + area);
    }
}
