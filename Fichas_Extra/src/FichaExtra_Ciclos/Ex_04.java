package FichaExtra_Ciclos;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1=1, count=1, num2=1, count2=1, num3=1, count3=1;

        while (num1 < 5 ) {
            while (count < 11) {
                System.out.print("*");
                count ++;
            }
            System.out.println();
            num1++;
            count = 1;
        }

        while (num2 <= 5) {
            while ( count2 <= num2 ) {
                System.out.print("*");
                count2 ++;
            }
            System.out.println("");
            num2++;
            count2 = 1;
        }

        while (num3 < 18) {

            while ( count3 <= num3 ) {
                if (count3 % 3 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                count3++;
                }

            System.out.println("");
            num3 = num3 + 3;
            count3 = 1;
        }
    }
}

