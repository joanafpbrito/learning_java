import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min, seg, minAc, segAc, horas;

        System.out.println("Introduza os minutos da música: ");
        min = input.nextInt();
        minAc= min;
        System.out.println("Introduza os segundos da música: ");
        seg = input.nextInt();
        segAc = seg;

        System.out.println("Introduza os minutos da segunda música: ");
        min = input.nextInt();
        minAc = minAc + min;
        System.out.println("Introduza os segundos da segunda música: ");
        seg = input.nextInt();
        segAc = segAc + seg;

        System.out.println("Introduza os minutos da terceira música: ");
        min = input.nextInt();
        minAc = minAc + min;
        System.out.println("Introduza os segundos da terceira música: ");
        seg = input.nextInt();
        segAc = segAc + seg;

        System.out.println("Introduza os minutos da quarta música: ");
        min = input.nextInt();
        minAc = minAc + min;
        System.out.println("Introduza os segundos da quarta música: ");
        seg = input.nextInt();
        segAc = segAc + seg;

        System.out.println("Introduza os minutos da quinta música: ");
        min = input.nextInt();
        minAc = minAc + min;
        System.out.println("Introduza os segundos da quinta música: ");
        seg = input.nextInt();
        segAc = segAc + seg;

        segAc = (minAc*60) + segAc;
        horas = segAc / 3600;
        seg = segAc % 3600;
        min = seg / 60;
        seg = seg % 60;

        System.out.println( horas + " " + min + " " + seg);
    }
}
