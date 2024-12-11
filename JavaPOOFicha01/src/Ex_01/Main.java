package Ex_01;


import static java.lang.Character.getName;

public class Main {

    public static void main(String[] args) {
        Person joana = new Person("Joana Brito", 27, 1.67);
        Person julieta = new Person("Julieta Brito", 1, 0.56);

        System.out.println("My name is " + joana.getName() + ", I am " + joana.getAge() + " years and " + joana.getHeight() + "m height!" );
        System.out.println("My niece is " + julieta.getName() + ", she is " + julieta.getAge() + " year and " + julieta.getHeight() + "m height!" );
    }
}
