package by.zapolski.homework7_1.task06.model;

public class Student {
    public String name;
    public String surname;
    public int group;

    public Student(String name, String surname, int group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + name + '\'' +
                "'" + surname + '\'' +
                ", " + group +
                '}';
    }
}
