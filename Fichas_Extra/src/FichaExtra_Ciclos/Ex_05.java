package FichaExtra_Ciclos;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1=1, count=1, num2=1, count2=1;

        while (num1 <=5) {
            while (count <= num1) {
                System.out.print(num1);
                count++;
            }
            System.out.println("");
            num1++;
            count = 1;
        }

        while (num2 <=5) {
            while (count2 <= num2) {
                if (count2 % 3 == 0) {
                    System.out.print(num2);
                    count2 = count2 +2;
                    break;
                } else {
                    System.out.print("");
                    count2 = count2 + 2;
                    break;
                }
            }
            System.out.println("");
            num2++;
            count2 = 1;
        }
    }
}
