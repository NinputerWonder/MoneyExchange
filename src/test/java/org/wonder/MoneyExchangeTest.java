package org.wonder;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyExchangeTest
{
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality()
    {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(6), new Dollar(5));
    }
}
