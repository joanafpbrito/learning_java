package FichaExtra_Ciclos;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total, num =1, count= 1;

        while (num < 11) {
            System.out.println("Tabuada do " + num + ":");
            for (count = 1; count < 11; count++) {
                total = num * count;
                System.out.println(num + " x " + count + " = " + total);
            }
            num++;
        }
    }
}
