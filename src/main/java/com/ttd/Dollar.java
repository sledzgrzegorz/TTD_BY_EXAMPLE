package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount=amount;
    }
    void times(int multiplier){
        amount*=multiplier;
    }
}
