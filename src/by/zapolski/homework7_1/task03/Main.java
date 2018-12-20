package by.zapolski.homework7_1.task03;

import by.zapolski.homework7_1.task03.model.Money;
import by.zapolski.homework7_1.task03.service.MoneyService;

public class Main {
    public static void main(String[] args) {

        MoneyService moneyService = new MoneyService();

        Money money1 = new Money(0,(byte)9);
        Money money2 = new Money(10,(byte)99);
        System.out.println("Деньга 1: "+money1);
        System.out.println("Деньга 2: "+money2);
        System.out.println("Сумма д1+д2: "+moneyService.sum(money1,money2));
        System.out.println("Вычитание д1-д2: "+moneyService.sub(money1,money2));
        System.out.println("Деление д1 на 4: "+moneyService.div(money1,4));
        System.out.println("Умножение д1 на 3: "+moneyService.mult(money1,3));
        System.out.println("Сравнение д1>д2: "+(money1.compareTo(money2) > 0));
    }
}
