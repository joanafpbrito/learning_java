package Ex_02;

public class Main {
    public static void main(String[] args) {
        Person ju = new Person ("Julieta", 1, 919999119, "julieta@julieta.julieta");
        Person me = new Person("Joana", 28, 912233445, "joana@joana.joana");
        Person mom = new Person("Cristina", 57, 911222333, "cristina@cristina.cristina");
        Person dad = new Person("Manuel", 57, 922333444, "manuel@manuel.manuel");
        Person bro = new Person("Nelito", 32, 933444555, "nelito@nelito.nelito");
        Person love = new Person("João", 36, 944555666, "joao@joao.joao");
        Person loveMom = new Person("Helena", 60, 955666777, "helena@helena.helena");
        Person loveDad = new Person("Alfredo", 62, 966777888, "alfredo€alfredo.alfredo");

        Drawing euromilhoes = new Drawing(555000);

        euromilhoes.addParticipants(ju);
        euromilhoes.addParticipants(me);
        euromilhoes.addParticipants(mom);
        euromilhoes.addParticipants(dad);
        euromilhoes.addParticipants(bro);
        euromilhoes.addParticipants(love);
        euromilhoes.addParticipants(loveDad);
        euromilhoes.addParticipants(loveMom);

        euromilhoes.drawingDetails();

        System.out.println("***Winner***");

        euromilhoes.drawing().details();
    }
}
