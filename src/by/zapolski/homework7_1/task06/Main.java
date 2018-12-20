package by.zapolski.homework7_1.task06;

import by.zapolski.homework7_1.task06.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //System.out.println("Список студентов: ");
        //создали массив студентов и заполнили его
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Name"+i,"Surname"+i,i+50);
            //System.out.println(students[i]);
        }

        //создали библиотеку
        Library library = new Library();

        //заполнили книгами
        for (int i = 0; i < library.books.length; i++) {
            library.books[i]=new Book("Title"+i,"Author"+i);
        }
        /*System.out.println("Список книг в библиотеке: ");
        library.printBooks();*/

        //заполнили читательские билеты
        for (int i = 0; i < students.length; i++) {
            library.cards[i] = new LibraryCard(i,students[i]);
        }
        /*System.out.println("Список читательских билетов: ");
        library.printCards();*/

        library.register[0] = new LibraryRecord(TypeOperation.OUTPUT,library.books[0],students[0],
                LocalDate.of(2018,1,1),5);
        library.register[1] = new LibraryRecord(TypeOperation.OUTPUT,library.books[1],students[1],
                LocalDate.of(2018,2,1),5);

        library.register[2] = new LibraryRecord(TypeOperation.OUTPUT,library.books[2],students[2],
                LocalDate.of(2018,3,1),5);
        library.register[3] = new LibraryRecord(TypeOperation.INPUT,library.books[2],students[2],
                LocalDate.of(2018,3,8));

        library.register[4] = new LibraryRecord(TypeOperation.OUTPUT,library.books[3],students[3],
                LocalDate.of(2018,12,10),20);



        System.out.println("Журнал библиотеки: ");
        library.printRegister();

        System.out.println("Должники: ");
        library.printDebtors();

    }
}
