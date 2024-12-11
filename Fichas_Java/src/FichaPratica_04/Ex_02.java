package FichaPratica_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        boolean exit = true;

        do {
            System.out.println("1. Criar");
            System.out.println("2. Actualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.println("Insira a opção pretendida:");
            option = input.nextInt();

            switch (option) {
                case 1 :
                    System.out.println("Vamos começar a criar");
                    break;
                case 2 :
                    System.out.println("Pedimos desculpa, vamos actualizar!");
                    break;
                case 3 :
                    System.out.println("Eliminar todas as alterações");
                    break;
                case 4 :
                    exit = false;
                    break;
                default :
                    System.out.println("Escolha uma opção válida");
            }
        } while (exit);
    }
}
