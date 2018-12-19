package by.zapolski.homework7_1.task03.model;

public class Money implements Comparable{
    public long dollars;

    public byte cents;

    public Money(long dollars, byte cente) {
        this.dollars = dollars;
        this.cents = cente;
    }

    @Override
    public String toString() {
        return dollars+","+(cents>10?"":"0")+cents;
    }

    @Override
    public int compareTo(Object o) {
        long cents1 = this.dollars*100+this.cents;
        long cents2 = ((Money)o).dollars*100+((Money)o).cents;
        return Long.compare(cents1, cents2);
    }
}
