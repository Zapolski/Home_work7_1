package by.zapolski.homework7_1.task05.model;

public class Complex {
    public double a;
    public double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Complex: " + a + (b>=0?"+":"") + b + "i";
    }
}
