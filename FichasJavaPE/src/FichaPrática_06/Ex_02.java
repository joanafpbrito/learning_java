package FichaPrática_06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * função para imprimir uma linha de x asteriscos
     * @param num quantidade de asteriscos
     */
    public static void asterisco(int num) {
          for ( int i = 0; i < num; i++) {
              System.out.print("*");
          }
      }

    public static void caracter(int num, String simbolo) {
        for ( int i = 0; i < num; i++) {
            System.out.print(simbolo);
        }
    }
      

    /**
     * função para receber e verificar do utilizador um número inteiro positivo
      * @return número inteiro positivo
     */
    public static int positivoInteiro () {
        Scanner input = new Scanner(System.in);

        int num = 0;
        while (num <= 0) {
            System.out.println("Introduza um número: ");
            num = input.nextInt();
        }
        return num;
    }


    public static void main(String[] args) {
       
        //int numUser = positivoInteiro();
        // asterisco(numUser);
        
        asterisco(positivoInteiro());
        
        Scanner input = new Scanner(System.in);
        String caract = input.next();
        
        caracter(positivoInteiro(), caract);
        
    }
}
