package FichaPrática_06;

public class Ex_Aula_LibrariaExemplo {
    /**
     * Função que retorna se um número é ou não primo
     * @param num - Número a ser analisado
     * @return true : primo || false: não primo
     */

    public static boolean primo (int num) {

        //boolean numPrimo = true;

        //for (int i =2; i < num; i++) {
        //if (num%i==0) { //número não é primo
        //numPrimo = false;
        //}
        //}

        //if (numPrimo) {
        // return true;
        //} else {
        //return false;
        //}

        for (int i = 2; i < num; i++) {
            if (num % i == 0) { //número não é primo
                return false;
            }
        }
    return true;

    }

    /**
     * Função que retorna o menor de 3 números inteiros
     * @param num1 Número a ser analisado
     * @param num2 Número a ser analisado
     * @param num3 Número a ser analisado
     * @return O menor de 3 númerios inteiros
     */
    public static int menor3numeros ( int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        if (num3 < num1 && num3 < num2) {
            return num3;
        }
        return 0;
    }

    /**
     * Função que retorna o maior de 3 números inteiros
     * @param num1 Número a ser analisado
     * @param num2 Número a ser analisado
     * @param num3 Número a ser analisado
     * @return O maior de 3 númerios inteiros
     */
    public static int maior3numeros ( int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        }
        if (num2 > num1 && num2 > num3) {
            return num2;
        }
        if (num3 > num1 && num3 > num2) {
            return num3;
        }
        return 0;
    }
}