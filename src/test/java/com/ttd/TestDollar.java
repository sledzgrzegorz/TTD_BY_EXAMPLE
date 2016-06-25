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
        Dollar product=five.times(2);
        Assert.assertEquals(10,product.amount);
        product=five.times(3);
        Assert.assertEquals(15,product.amount);
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
