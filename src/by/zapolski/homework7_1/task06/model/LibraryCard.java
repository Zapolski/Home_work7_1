package by.zapolski.homework7_1.task06.model;

public class LibraryCard {
    public int id;
    public Student student;

    public LibraryCard(int id, Student student) {
        this.id = id;
        this.student = student;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }
}
