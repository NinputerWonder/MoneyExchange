package org.wonder;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyExchangeTest
{
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality()
    {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(5), five);
        assertNotEquals(new Dollar(6), five);
    }
}
