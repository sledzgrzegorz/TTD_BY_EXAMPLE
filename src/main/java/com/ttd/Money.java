package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public  class Money {
    protected int amount;

    protected String currency;

    public Money(int amount,String currency) {
        this.amount=amount;
        this.currency=currency;
    }

     Money times(int multiplayer){
         return new Money(amount*multiplayer,currency);
     }

    @Override
    public boolean equals(Object obj) {
        Money money=(Money)obj;
        return amount==money.amount&&currency.equals(money.currency());
    }
    static Money franc(int amount){
        return new Money(amount,"CHF");
    }
    static Money dollar(int amount){
        return new Money(amount,"USD");
    }

    public  String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return amount+" "+currency;
    }
}
