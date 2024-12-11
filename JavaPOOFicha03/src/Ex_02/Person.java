package Ex_02;

public class Person {
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    public Person(String name, int age, int phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void details() {
        System.out.println("Name: " + this.name + " | Age: " + this.age + " | Phone Number: " + this.phoneNumber + " | E-mail: " + this.email);
    }
}
