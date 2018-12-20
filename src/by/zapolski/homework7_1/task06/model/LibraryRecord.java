package by.zapolski.homework7_1.task06.model;

import java.time.LocalDate;

public class LibraryRecord {
    public TypeOperation operation;
    public Book book;
    public Student student;
    public LocalDate date;
    public int countDays;

    public LibraryRecord(TypeOperation operation, Book book, Student student, LocalDate date, int countDays) {
        this.operation = operation;
        this.book = book;
        this.student = student;
        this.date = date;
        this.countDays = countDays;
    }

    public LibraryRecord(TypeOperation operation, Book book, Student student, LocalDate date) {
        this.operation = operation;
        this.book = book;
        this.student = student;
        this.date = date;
        this.countDays = 0;
    }


    @Override
    public String toString() {
        return "{" +
                "operation=" + operation +
                ", " + book +
                ", " + student +
                ", " + date +
                ", countDays=" + countDays +
                '}';
    }
}
