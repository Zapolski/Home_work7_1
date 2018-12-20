package by.zapolski.homework7_1.task05;

import by.zapolski.homework7_1.task05.model.Complex;
import by.zapolski.homework7_1.task05.service.ComplexService;

public class Main {
    public static void main(String[] args) {
        ComplexService complexService = new ComplexService();

        Complex complex1 = new Complex(3,2);
        Complex complex2 = new Complex(3,-9);
        System.out.println("1: "+complex1);
        System.out.println("1: "+complex2);

        System.out.println("Сумма с1+c2: "+complexService.sum(complex1,complex2));
        System.out.println("Вычитание с1-с2: "+complexService.sub(complex1,complex2));
        System.out.println("Умножение с1*с2: "+complexService.mult(complex1,complex2));
        System.out.println("Равенство с1=с2: "+complexService.isEqual(complex1,complex2));
    }
}
