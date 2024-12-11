package Ex_08;

public class Student {
    private String name;
    private int age;
    private String course;
    private double grade;

    public Student (String name, int age, String course, double grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String reality () {
        if (this.grade >= 9.5) {
            return "Aproved!";
        }else{
            return "Try again!";
        }
    }

}
