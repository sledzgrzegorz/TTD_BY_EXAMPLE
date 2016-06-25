package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount=amount;
    }

    abstract Money times(int multiplayer);

    @Override
    public boolean equals(Object obj) {
        Money money=(Money)obj;
        return amount==money.amount&&getClass().equals(money.getClass());
    }
    static Franc franc(int amount){
        return new Franc(amount);
    }
    static Dollar dollar(int amount){
        return new Dollar(amount);
    }
}
