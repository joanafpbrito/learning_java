package FichaExtra_Ciclos;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count=1; count <256; count++) {
            if (count % 3 == 0) {
                System.out.println(count);
            }
        }
    }
}
