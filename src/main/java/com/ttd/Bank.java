package com.ttd;

import java.util.Hashtable;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class Bank {
    private Hashtable rates=new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        return (Integer)rates.get(new Pair(from,to));
    }
    void addRate(String from,String to,int rate){
        rates.put(new Pair(from,to),rate);
    }


}
