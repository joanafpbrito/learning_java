package FichaPratica_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int musica1m, musica1s, musica2m, musica2s, musica3m, musica3s, musica4m, musica4s, musica5m, musica5s;
        int horas, minutos, segundos, totalSeg;


        System.out.print("Introduza os minutos da música: ");
        musica1m = input.nextInt();
        System.out.print("Introduza os segundos da música: ");
        musica1s = input.nextInt();
        System.out.println("Música_01: " + musica1m + ":" + musica1s);

        System.out.print("Introduza os minutos da música: ");
        musica2m = input.nextInt();
        System.out.print("Introduza os segundos da música: ");
        musica2s = input.nextInt();
        System.out.println("Música_02: " + musica2m + ":" + musica2s);

        System.out.print("Introduza os minutos da música: ");
        musica3m = input.nextInt();
        System.out.print("Introduza os segundos da música: ");
        musica3s = input.nextInt();
        System.out.println("Música_03: " + musica3m + ":" + musica3s);

        System.out.print("Introduza os minutos da música: ");
        musica4m = input.nextInt();
        System.out.print("Introduza os segundos da música: ");
        musica4s = input.nextInt();
        System.out.println("Música_04: " + musica4m + ":" + musica4s);

        System.out.print("Introduza os minutos da música: ");
        musica5m = input.nextInt();
        System.out.print("Introduza os segundos da música: ");
        musica5s = input.nextInt();
        System.out.println("Música_05: " + musica5m + ":" + musica5s);

        //somar o segundos todos

        totalSeg = ((musica1m + musica2m + musica3m + musica4m + musica5m) * 60 + (musica1s + musica2s + musica3s + musica4s + musica5s));
        horas = totalSeg / 3600 ;
        segundos = totalSeg % 3600 ;
        minutos = segundos / 60 ;
        segundos = totalSeg % 60 ;

        //horas = totalSeg / 3600;
        //minutos = (totalSeg / 60 - ( horas *60 );
        //segundos = totalSeg - (horas *3600) - (minutos * 60)

        System.out.println( "O álbum tem " + horas + ":" + minutos + ":" + segundos);




        //dividir por 60 e ficar com o valor que sobra --  valor que sobra é os segundos a apresentar FINAL (deve precisar de nova variavel)
        //somar os minutos todos + os minutos convertidos de segundos antes
        //fazer igual ao passo 2 ( nova variavel para apresentar minutos
        //horas é igual ao valor convertido antes nova variavel para horas

    }
}
