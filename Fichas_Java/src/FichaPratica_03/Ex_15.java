package FichaPratica_03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5;
        int aux = num;
        System.out.println(aux);

        while (num >=2) {
            num = num - 1;
            aux = aux * num;

        }
        System.out.println(aux);
    }
}
