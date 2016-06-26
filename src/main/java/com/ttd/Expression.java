package com.ttd;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public interface Expression {
    Money reduce(Bank bank,String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
