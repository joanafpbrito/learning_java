package Ex_03;

public class Main {
    public static void main(String[] args) {
        String [] foodDumbo = new String[3];
        foodDumbo[0] = "Erva";
        foodDumbo[1] = "Milho";
        foodDumbo[2] = "Palha";

        String []foodDumbo2 = new String[] {"erva", "milho", "palha"};

        Animal theFirst = new Animal ("Dumbo", "Elephant", "South Africa", 1000, foodDumbo);
        Animal theSecond = new Animal ("Simba", "Lion", "Kenia", 350, foodDumbo2);
        Animal theThird = new Animal ("Kiara", "Dog", "Tuga", 40, new String[] {"erva", "milho", "palha"});
    }
}
