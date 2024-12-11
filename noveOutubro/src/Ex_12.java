import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lugar;

        System.out.println("Diga em que lugar ficou?");
        lugar = input.nextInt();

        switch (lugar) {
            case 1:
                System.out.println("Você terminou com 10 pontos!");
                break;
            case 2:
                System.out.println("Você terminou com 8 pontos!");
                break;
            case 3:
                System.out.println("Você terminou com 6 pontos!");
                break;
            case 4:
                System.out.println("Você terminou com 5 pontos!");
                break;
            case 5:
                System.out.println("Você terminou com 4 pontos!");
                break;
            case 6:
                System.out.println("Você terminou com 3 pontos!");
                break;
            case 7:
                System.out.println("Você terminou com 2 pontos!");
                break;
            case 8:
                System.out.println("Você terminou com 1 pontos!");
                break;
            default:
                System.out.println("Você não participou nesta corrida!");
        }
    }
}
