import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, mediaPo;

        System.out.println("Introduza o primeiro valor:");
        num1 = input.nextDouble();
        System.out.println("Introduza o segundo valor:");
        num2 = input.nextDouble();
        System.out.println("Introduza o terceiro valor:");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;
        System.out.println(media);
        mediaPo = num1*0.2 + num2*0.3 + num3*0.5;
        System.out.println(mediaPo);

    }
}
