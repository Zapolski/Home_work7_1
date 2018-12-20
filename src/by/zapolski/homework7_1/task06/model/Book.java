package by.zapolski.homework7_1.task06.model;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + title + '\'' +
                ", '" + author + '\'' +
                '}';
    }
}
