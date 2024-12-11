package Ex_07;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private String isbn;

    public Book (String title, String author, String genre, int pages, String isbn ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.isbn = isbn;
    }

    public void description () {
        System.out.println("***** TITLE *****");
        System.out.println("-" + this.title + "-");
        System.out.println("***** AUTHOR *****");
        System.out.println("-" + this.author + "-");
        System.out.println("***** GENRE *****");
        System.out.println("-" + this.genre + "-");
        System.out.println("***** PAGES *****");
        System.out.println("-" + this.pages + "-");
        System.out.println("***** ISBN *****");
        System.out.println("-" + this.isbn + "-");
    }
}
