package FichaPratica_03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, set1 = 0, set2 = 0, set3 = 0, set4 = 0;

        while ( num >= 0 ) {
            System.out.print("Introduza um número: ");
            num = input.nextInt();

            if ( num >= 0 && num <= 25 ) {
                set1 = set1 + 1;
            }
            if ( num > 25 && num <= 50 ) {
                set2 = set2 + 1;
            }
            if ( num > 50 && num <= 75 ) {
                set3 = set3 + 1;
            }
            if ( num > 75 && num <= 100 ) {
                set4 = set4 + 1;
            }
        }

        System.out.println("[00, 25]: " + set1 );
        System.out.println("[26, 50]: " + set2 );
        System.out.println("[51, 75]: " + set3 );
        System.out.println("[76, 100]: " + set4 );

    }
}

