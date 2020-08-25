package org.wonder;

import static org.junit.Assert.*;

import org.junit.Test;

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
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(6), new Franc(5));
        assertNotEquals(new Franc(5), Money.dollar(5));
    }

    @Test
    public void testFrancMultiplication()
    {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
