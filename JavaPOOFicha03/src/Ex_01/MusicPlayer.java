package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    ArrayList<Music> programming;

    public MusicPlayer() {
        this.programming = new ArrayList<Music> ();
    }

    public void addMusic (Music newMusic) {
        this.programming.add(newMusic);
    }

    public void removeMusic (int indexRemove) {
        this.programming.remove(indexRemove);
    }

    public void removeMusic2 (Music remMusic){
        this.programming.remove(remMusic);
    }

    public void changeMusic (int indexChange, Music newMusic) {
        this.programming.set(indexChange, newMusic);
    }

    public void changeMusic2 (int indexChange, int indexChange2) {
        Music auxMusic = this.programming.get(indexChange);

        this.programming.set(indexChange, this.programming.get(indexChange2));
        this.programming.set(indexChange2, auxMusic);
    }

    public void changeMusic3 (Music music1, Music music2) {
        if (this.programming.contains(music1) && this.programming.contains(music2)) {
            int indexMusic1 = this.programming.indexOf(music1);
            int indexMusic2 = this.programming.indexOf(music2);

            this.programming.set(indexMusic1, music2);
            this.programming.set(indexMusic2, music1);
        }
    }

    public void cleanProgramming() {
        this.programming.clear();
    }

    public void calculate() {
        int totalSeconds=0;

        for (Music music : this.programming) {
            totalSeconds += music.getSeconds();
        }
        int hours, minutes, seconds;

        hours =totalSeconds/3600;
        minutes = totalSeconds / 60 - (hours*60);
        seconds = totalSeconds -(hours*3600) - (minutes*60);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public void printDetails() {
        for (int i = 0; i< this.programming.size(); i++) {
            System.out.println("Music " + (i+1) + " - ");
            this.programming.get(i).details();
        }
    }
}
