package by.zapolski.homework7_1.task06.model;

import java.time.LocalDate;

public class Library {

    public int n=5;
    public LibraryRecord[] register = new LibraryRecord[n];
    public Book[] books = new Book[n];
    public LibraryCard[] cards = new LibraryCard[n];


    public void printBooks(){
        for (Book b: books) System.out.println(b);
    }

    public void printRegister(){
        for (LibraryRecord lr: register) System.out.println(lr);
    }

    public void printCards(){
        for (LibraryCard lc: cards) System.out.println(lc);
    }

    public void printDebtors() {
        for (int i = 0; i < register.length; i++) {
            if ((register[i] != null) && (register[i].operation == TypeOperation.OUTPUT)) {//нашли операцию выдачи
                //предполагаем, что это не должник
                boolean isDebtor = false;
                //предполагаем, что книга не сдана
                boolean isInput = false;
                //дата требуемой сдачи
                LocalDate expectedDate = register[i].date.plusDays(register[i].countDays);
                for (int j = i; j < register.length - 1; j++) {//бежим по журналу для поиска возврата
                    //если нашли хоть какой-нибудь возврат
                    if ((register[j] != null) && (register[j].operation == TypeOperation.INPUT)) {
                        //нашли возврат этой книги этим студентом
                        if ((register[i].book == register[j].book) && (register[i].student == register[j].student)) {
                            //смотрим корректен ли возврат
                            if (!register[j].date.isBefore(expectedDate)) isDebtor = true;
                            isInput = true;
                            break;
                        }
                    }
                }

                //если книгу не вернули
                if (!isInput){
                    if (!LocalDate.now().isBefore(expectedDate))//проверяем не истекло ли время
                        System.out.println("Студент " + register[i].student + " уже просрочил сдачу " + register[i].book);
                }else{
                    if (isDebtor)//проверяем должник ли это
                        System.out.println("Студент " + register[i].student + " не вовремя сдал книгу " + register[i].book);
                }




            }
        }

    }

}
