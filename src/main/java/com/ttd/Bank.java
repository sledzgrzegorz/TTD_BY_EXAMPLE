package com.ttd;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class Bank {
    Money reduce(Expression source,String to){
        if(source instanceof Money)
            return (Money)source;
        Sum sum=(Sum)source;
        return sum.reduce(to);
    }

}
