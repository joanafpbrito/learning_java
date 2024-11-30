package FichaExtra_Funções;

import org.w3c.dom.ls.LSOutput;

public class Ex_00_Biblioteca {

    /**
     * função que avalia 3 números dados pelo utilizador
     * @param num1 número a avaliar
     * @param num2 número a avaliar
     * @param num3 número a avaliar
     * @return o menor dos números
     */
    public static int numPequeno(int num1, int num2, int num3) {
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
     * função que lê 3 números e calcula a média deles
     * @param num1 número a avaliar
     * @param num2 número a avaliar
     * @param num3 número a avaliar
     * @return a média dos 3 números
     */
    public static double media(double num1, double num2, double num3) {
        double resultado = (num1+num2+num3)/3;

        return resultado;
    }

    /**
     * função que lê a largura e comprimento de um rectângulo e calcula a área
     * @param largura largura do rectângulo
     * @param comprimento comprimento do rectângulo
     * @return a área do rectângulo
     */
    public static double areaRetangulo(double largura, double comprimento) {
        return largura*comprimento;
    }

    /**
     * função que imprime a tabuada de um número dado
     * @param num número a avaliar
     */
    public static void imprimirTabuada(int num) {
        int resultado;
        for (int i =1; i <11; i++) {
            resultado = num*i;

            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

    /**
     * função que imprime uma piada consoante o nr que o user dá
     * @param numPiada número dado pelo user que corresponde à posição no array
     * @return uma string com a piada
     */
    public static String veryFunny(int numPiada) {
        String [] armarioPiadas = new String[15];

        armarioPiadas[0] = "Encontrei um sapo dentro do meu computador.\n" + "\n" + "Agora tenho mais memória-rã.";
        armarioPiadas[1] = "Por que o astronauta que matou o outro no espaço não foi preso?\n" + "\n" + "Foi um crime sem gravidade.";
        armarioPiadas[2] = "Filho, porque é que engoliste as moedas que eu te dei antes de ires para a escola?\n" + "\n" + "Porque tu disseste que eram para o lanche!";
        armarioPiadas[3] = "O que o martelo foi fazer à igreja?\n" + "\n" + "Pregar.";
        armarioPiadas[4] = "Porque é que o átomo comprou uma câmara?\n" + "\n" + "Para tirar fótons.";
        armarioPiadas[5] = "Por que é que a vaca foi para o espaço?\n" + "\n" + "Para se encontrar com o vácuo.";
        armarioPiadas[6] = "Eu ia lavar a loiça...\n" + "\n" + "Mas vi o detergente concentrado e não quis interromper.";
        armarioPiadas[7] = "Como é que os alpinistas se cumprimentam?\n" + "\n" + "Cume é que é!";
        armarioPiadas[8] = "Porque é que a morcega é tão feia?\n" + "\n" + "Porque o mor-é-cego.";
        armarioPiadas[9] = "Porque é que há um trampolim no Pólo Norte?\n" + "\n" + "Para o Urso Polar.";
        armarioPiadas[10] = "Como se sabe que o Estado é católico?\n" + "\n" + "Porque tudo o que faz leva um terço.";
        armarioPiadas[11] = "Qual é a sobremesa que nunca sai bem?\n" + "\n" + "A torta.";
        armarioPiadas[12] = "Porque é que o pescador alentejano bateu na rocha?\n" + "\n" + "Navio.";
        armarioPiadas[13] = "Qual é o peixe mais prestigiado do Reino Unido?\n" + "\n" + "É o Sir Dinha.";
        armarioPiadas[14] = " Qual o nome do Ângelo no verão?\n" + "\n" + "Ânágua.";

        if (numPiada >= 0 && numPiada < armarioPiadas.length) {
            return armarioPiadas[numPiada];
        } else {
            return "Não temos tanta piada assim!";
        }

    }

    /**
     * função que calcula o somatório de todos os algorismos de um nr
     * @param num número dado pelo user
     * @return o somatório dos algarismos do número
     */
    public static int somatorio(int num) {
        int alg1, alg2, alg3, alg4, soma = 0;
        if (num < 10000 && num > 0) {
            if ((num / 1000) > 0) {
                alg1 = num / 1000;
                num = num - (alg1 * 1000);
                alg2 = num / 100;
                num = num - (alg2 * 100);
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = alg1 + alg2 + alg3 + alg4;

                return soma;
            }

            if ((num / 100) > 0) {
                alg1 = 0;
                alg2 = num / 100;
                num = num - (alg2 * 100);
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = alg1 + alg2 + alg3 + alg4;

                return soma;
            }

            if ((num / 10) > 0) {
                alg1 = 0;
                alg2 = 0;
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = alg1 + alg2 + alg3 + alg4;

                return soma;
            }

            if ((num / 1) > 0) {
                alg1 = 0;
                alg2 = 0;
                alg3 = 0;
                alg4 = num;
                soma = alg1 + alg2 + alg3 + alg4;

                return soma;
            }

        }

        return 0;
    }

    /**
     * função que inverte a ordem dos algarismos de um número dado pelo user
     * @param num número dado pelo user
     * @return número do user invertido
     */
    public static int inverNum(int num) {
        int alg1, alg2, alg3, alg4, soma;
        if (num < 10000 && num > 0) {
            if ((num / 1000) > 0) {
                alg1 = num / 1000;
                num = num - (alg1 * 1000);
                alg2 = num / 100;
                num = num - (alg2 * 100);
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = (alg4*1000) + (alg3*100) + (alg2*10) + alg1;

                return soma;
            }

            if ((num / 100) > 0) {
                alg1 = 0;
                alg2 = num / 100;
                num = num - (alg2 * 100);
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = (alg4*100) + (alg3*10) + alg2 + alg1;

                return soma;
            }

            if ((num / 10) > 0) {
                alg1 = 0;
                alg2 = 0;
                alg3 = num / 10;
                num = num - (alg3 * 10);
                alg4 = num;
                soma = (alg4*10) + alg3 + alg2 + alg1;

                return soma;
            }

            if ((num / 1) > 0) {
                alg1 = 0;
                alg2 = 0;
                alg3 = 0;
                alg4 = num;
                soma = alg4 + alg3 + alg2 + alg1;

                return soma;
            }

        }

        return 0;
    }

    public static String vogal (String letra)
        if (letra == "a" || "A") {
        case :


    }
}
