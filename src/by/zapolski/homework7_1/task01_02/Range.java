package by.zapolski.homework7_1.task01_02;

import by.zapolski.homework7_1.ConsoleUtils;

public class Range {

    private int start;
    private int end;

    public static Range createRange (){
        int start = ConsoleUtils.getIntFormConsole("Введите начало диапазона: ");
        int end = ConsoleUtils.getIntFormConsole("Введите конец диапазона: ");
        if (start>end) {
            System.out.println("Ошибка создания: начало диапзона больше конца!");
            return null;
        }
        return new Range(start,end);
    }

    private Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getLenght(){
        return end-start;
    }

    @Override
    public String toString() {
        return String.format("[%d,%d]",start,end);
    }

    public boolean isIntersect (Range range){
        return ((this.start >= range.start) && (this.start <= range.end)) ||
                ((this.end >= range.start) && (this.end <= range.end));
    }
}
