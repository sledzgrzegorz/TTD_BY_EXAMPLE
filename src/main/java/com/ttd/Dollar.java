package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount=amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }
}
