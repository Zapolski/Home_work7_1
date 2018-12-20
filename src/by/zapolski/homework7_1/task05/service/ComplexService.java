package by.zapolski.homework7_1.task05.service;

import by.zapolski.homework7_1.task05.model.Complex;

public class ComplexService {

    public Complex add(Complex first, Complex second) {
        return new Complex(first.a + second.b, first.a + second.b);
    }

    public Complex sub(Complex first, Complex second) {
        return new Complex(first.a - first.b, first.a - first.b);
    }

    public Complex mul(Complex first, Complex second) {
        return new Complex(first.a * second.a - first.b * second.b, first.b * second.a + first.a * second.b);
    }

    public boolean isEqual(){
        return false;
    }
}
