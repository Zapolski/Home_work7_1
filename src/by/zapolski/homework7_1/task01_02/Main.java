package by.zapolski.homework7_1.task01_02;

public class Main {
    public static void main(String[] args) {

        Range range = Range.createRange();
        Range range2 = Range.createRange();
        if (range!=null) System.out.printf("Длина дипазона %s: %d\n",range,range.getLenght());
        if (range2!=null) System.out.printf("Длина дипазона %s: %d\n",range2,range2.getLenght());

        if (range.isIntersect(range2)) System.out.println("Диапазоны пересекаются!");
        else System.out.println("Диапазоны не пересекаются!");

    }
}
