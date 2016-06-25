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
        Assert.assertEquals(new Dollar(10),five.times(2));
        Assert.assertEquals(new Dollar(15),five.times(3));
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
