package com.ttd;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Franc  extends Money{


    public Franc(int amount){
        super(amount);
    }
    Money times(int multiplayer){
        return new Franc(amount*multiplayer);
    }


}
