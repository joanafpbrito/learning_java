package FichaPrática_06;

public class Ex_03 {
    /**
     * função que determina se um número é par ou ímpar
     *
     * @param num número a ser avaliado
     * @return true ou false
     */
    public static boolean even(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * função que determina se um número é positivo ou negativo
     * @param num número a ser avaliado
     * @return true ou false
     */
    public static boolean positive(int num) {
        if (num < 0 ) {
            return false;
        }
        return true;
    }


    /**
     * função que determina se um número é primo ou não
     *
     * @param num número a ser avaliado
     * @return true ou false
     */
    public static boolean prime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * função que avalia se um número é perfeito ou não
     * @param num número a analisar
     * @return true ou false
     */
    public static boolean perfeito(int num) {
        // num perfeito precisa de descobrir todos os divisores que não deixam resto e depois soma-los e verificar se a soma é igual ao número em si
        int soma = 1;
        for (int i = 2; i < num ; i++) {
            if (num % i == 0 ) {
                soma += (num/i);
                //System.out.println(soma);
            }
        }
        // System.out.println(soma);
        if (soma == num) {
            return true;
        }
        return false;
    }


    public static boolean triangular(int num) {
        int soma = 0;
        for (int i = 1 ; i <= num; i++) {
            soma+= i;
            if ( num == soma) {
                return true;
            }
        }
        return false;
    }
}