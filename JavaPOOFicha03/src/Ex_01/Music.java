package Ex_01;

import javax.xml.transform.Source;

public class Music {
    private String title;
    private String genre;
    private String Artist;
    private int seconds;

    public Music(String title, String genre, String artist, int seconds) {
        this.title = title;
        this.genre = genre;
        Artist = artist;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void details() {
        System.out.println("Title: " + this.title + "\nGenre: " + this.genre + "\nArtist: " + this.Artist + "\nSeconds: " + this.seconds + "seconds");
    }
}
