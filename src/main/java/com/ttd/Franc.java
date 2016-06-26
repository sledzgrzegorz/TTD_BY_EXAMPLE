package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Franc  extends Money{


    public Franc(int amount,String currency){
        super(amount,currency);
    }
    public Money times(int multiplayer){
        return  new Franc(amount*multiplayer,currency);
    }


}
