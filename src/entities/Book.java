package entities;

public class Book {
    private String title;
    private Author author;
    private String genre;
    private int year;

    public Book(String title, Author author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + " by " + author.getName() + " (" + genre + ", " + year + ")";
    }
}
