package FichaExtra_Condicionais;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vogal;

        System.out.println("Introduza uma letra:");
        vogal = input.next();

        switch (vogal.toLowerCase()) {
            case "a" :
                System.out.println("É uma vogal!");
                break;
            case "e" :
                System.out.println("É uma vogal!");
                break;
            case "i" :
                System.out.println("É uma vogal!");
                break;
            case "o" :
                System.out.println("É uma vogal!");
                break;
            case "u" :
                System.out.println("É uma vogal!");
                break;
            default:
                System.out.println("É uma consoante!");
        }
    }
}
