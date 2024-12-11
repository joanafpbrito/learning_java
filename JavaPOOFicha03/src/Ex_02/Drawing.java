package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Drawing {
    private double prize;
    private ArrayList<Person> participants;

    public Drawing (double prize) {
        this.prize = prize;
        this.participants = new ArrayList<Person>();
    }

    public void addParticipants(Person newIn) {
        if (newIn.getAge() >= 18) {
            System.out.println(newIn.getName() + " successfully registered!");
            participants.add(newIn);
        } else {
            System.out.println(newIn.getName() + " is not old enough!");
        }
    }

    public void drawingDetails() {
        System.out.println("***To win " + this.prize + "***");

       // for (int i= 0; i < this.participants.size(); i++) {
       //     this.participants.get(i).details();
       // }
        // OU

        for (Person newPerson : this.participants) {
            newPerson.details();
        }
    }

    public Person drawing() {
        Random randomGenerator = new Random();
        int indexDrawing = randomGenerator.nextInt(0, this.participants.size());

        return this.participants.get(indexDrawing);
    }

}
