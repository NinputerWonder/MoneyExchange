package org.wonder;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount , currency);
    }

    @Override
    public Money times(int times) {
        return Dollar.franc(amount * times);
    }
}


