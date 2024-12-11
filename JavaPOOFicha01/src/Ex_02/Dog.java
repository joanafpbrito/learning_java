package Ex_02;

public class Dog {
    private String name;
    private String breed;
    private String bark = "Au Au Au!";

    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String newBark) {
        this.bark = newBark;
    }

}
