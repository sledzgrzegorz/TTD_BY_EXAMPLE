package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public  class Money implements Expression{


    protected int amount;

    protected String currency;

    public Money(int amount,String currency) {
        this.amount=amount;
        this.currency=currency;
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



    public Money reduce(Bank bank,String to) {
        int rate=(currency.equals("CHF")&&to.equals("USD"))?2:1;
        return new Money(amount/rate,to);
    }

    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }

    public Expression times(int multiplier) {
            return new Money(amount*multiplier,currency);
    }


    public  String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return amount+" "+currency;
    }

}
