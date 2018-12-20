package by.zapolski.homework7_1.task05.service;

import by.zapolski.homework7_1.task05.model.Complex;

public class ComplexService {

    public Complex sum(Complex first, Complex second) {
        return new Complex(first.a + second.a, first.b + second.b);
    }

    public Complex sub(Complex first, Complex second) {
        return new Complex(first.a - second.a, first.b - second.b);
    }

    public Complex mult(Complex first, Complex second) {
        return new Complex(first.a * second.a - first.b * second.b, first.b * second.a + first.a * second.b);
    }

    public boolean isEqual(Complex first, Complex second) {
        return ((first.a==second.a)&&(first.b==second.b));
    }
}
