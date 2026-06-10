/*@Author-Nino Kveseladze*/
package homework7;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title) {
        this(title, "Unknown", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Year: " + year;
    }
}
