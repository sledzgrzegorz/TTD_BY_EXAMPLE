package com.ttd;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class TestDollar {
    @Test
    public void testMulitpilication(){
        Dollar five=new Dollar(5);
        five.times(2);
        Assert.assertEquals(10,five.amount);
    }
}
