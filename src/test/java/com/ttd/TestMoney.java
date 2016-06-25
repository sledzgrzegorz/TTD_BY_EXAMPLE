package com.ttd;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class TestMoney {
    @Test
    public void testMulitpilication(){
        Dollar five=Money.dollar(5);
        Assert.assertEquals(Money.dollar(10),five.times(2));
        Assert.assertEquals(Money.dollar(15),five.times(3));
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
        Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
        Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    @Test
    public void testFrancMultiplication(){
        Franc five = Money.franc(5);
        Assert.assertEquals(Money.franc(10),five.times(2));
        Assert.assertEquals(Money.franc(15),five.times(3));
    }
    @Test
    public void testCurrency(){
        Franc five = Money.franc(5);
        Assert.assertEquals("USD",Money.dollar(1).currency());
        Assert.assertEquals("CHF",Money.franc(1).currency());
    }

}