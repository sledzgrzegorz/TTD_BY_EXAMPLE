package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount=amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money money=(Money)obj;
        return amount==money.amount;
    }
}
