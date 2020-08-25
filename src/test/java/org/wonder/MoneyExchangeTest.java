package org.wonder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyExchangeTest
{
    @Test
    public void testMultiplication()
    {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality()
    {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(6), Money.dollar(5));
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    public void testCurrency()
    {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testPlusReturnsSum(){
        Money five = Money.dollar(5);
        Expression expression =  five.plus(five);
        Sum sum = (Sum)expression;
        assertEquals(five, sum.getAugend());
        assertEquals(five, sum.getAddend());
    }

    @Test
    public void testReduceSum(){
        Bank bank = new Bank();
        Money reduced = bank.reduce(new Sum(Money.dollar(3) , Money.dollar(4)) , "USD");
        assertEquals(Money.dollar(7), reduced);
    }

    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money reduced = bank.reduce(Money.dollar(5) , "USD");
        assertEquals(Money.dollar(5), reduced);
    }

    @Test
    public void testSimpleAddition()
    {
        Money five = Money.dollar(5);
        Expression sum =  five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money reduced = bank.reduce(Money.franc(2) , "USD");
        assertEquals(Money.dollar(1), reduced);
    }
}
