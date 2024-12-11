import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, perimetro, area;

        System.out.println("Introduza a largura do rectângulo:");
        num1 = input.nextInt();

        System.out.println("Introduza o comprimento do rectângulo:");
        num2 = input.nextInt();

        perimetro = (num1+num2) * 2;
        area = num1*num2;

        System.out.println("O seu retângulo mede " + perimetro + "m e tem " + area + "m2 de área total!");
    }
}
