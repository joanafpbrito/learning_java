package FichaPratica_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int begin, end;

        System.out.print("Introduza o início do intervalo: ");
        begin = input.nextInt();

        System.out.print("Introduza o fim do intervalo: ");
        end = input.nextInt();

        if (begin % 5 == 0) {
            System.out.println(begin);
            begin = begin + 5;
        }
        if ((begin + 1) % 5 == 0) {
            System.out.println(begin);
            begin = begin + 5;
        }
        if ((begin + 2) % 5 == 0) {
            System.out.println(begin);
            begin = begin + 5;
        }
        if ((begin + 3) % 5 == 0) {
            System.out.println(begin);
            begin = begin + 5;
        }
        if ((begin + 4) % 5 == 0) {
            System.out.println(begin);
            begin = begin + 5;
        }
    }
}
