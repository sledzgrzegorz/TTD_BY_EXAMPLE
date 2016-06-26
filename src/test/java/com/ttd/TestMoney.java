package com.ttd;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class TestMoney {
    @Test
    public void testMulitpilication(){
        Money five=Money.dollar(5);
        Assert.assertEquals(Money.dollar(10),five.times(2));
        Assert.assertEquals(Money.dollar(15),five.times(3));
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        Assert.assertEquals(Money.franc(10),five.times(2));
        Assert.assertEquals(Money.franc(15),five.times(3));
    }
    @Test
    public void testCurrency(){
        Money five = Money.franc(5);
        Assert.assertEquals("USD",Money.dollar(1).currency());
        Assert.assertEquals("CHF",Money.franc(1).currency());
    }
    @Test
    public void testSimpleAddition(){
       Money five=Money.dollar(5);
       Expression sum=five.plus(five);
        Bank bank=new Bank();
        Money reduced=bank.reduce(sum,"USD");
        Assert.assertEquals(Money.dollar(10),reduced);
    }

    @Test
    public void testPlusReturnSum(){
        Money five=Money.dollar(5);
        Expression result=five.plus(five);
        Sum sum=(Sum)result;
        Assert.assertEquals(five,sum.augend);
        Assert.assertEquals(five,sum.addend);
    }
    @Test
    public void testReduceSum(){
        Expression sum=new Sum(Money.dollar(3),Money.dollar(4));
        Bank bank=new Bank();
        Money result=bank.reduce(sum,"USD");
        Assert.assertEquals(Money.dollar(7),result);
    }
    @Test
    public void testReduceMoney(){
        Bank bank=new Bank();
        Money result=bank.reduce(Money.dollar(1),"USD");
        Assert.assertEquals(Money.dollar(1),result);
    }

}
