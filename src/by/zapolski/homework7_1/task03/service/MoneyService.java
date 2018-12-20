package by.zapolski.homework7_1.task03.service;

import by.zapolski.homework7_1.task03.model.Money;

public class MoneyService {

    private long getAllCents(Money money){
        return money.dollars*100+money.cents;
    }

    private Money getMoneyFormCents(long cents){
        return new Money(cents/100,(byte)Math.abs(cents%100));
    }

    public Money sum(Money first,Money second){
        long result = getAllCents(first)+getAllCents(second);
        return getMoneyFormCents(result);
    }

    public Money sub(Money first,Money second){
        long result = getAllCents(first)-getAllCents(second);
        return getMoneyFormCents(result);
    }

    public Money div(Money first,long divider){
        long result = getAllCents(first)>0 ? (long)Math.floor(getAllCents(first)/(double)divider) :
                (long)Math.ceil(getAllCents(first)/(double)divider);
        return getMoneyFormCents(result);
    }

    public Money mult (Money first, long multiplier){
        long resut = getAllCents(first)*multiplier;
        return getMoneyFormCents(resut);
    }




}
