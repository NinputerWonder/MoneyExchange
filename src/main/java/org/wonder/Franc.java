package org.wonder;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int times) {
        return Dollar.franc(amount * times);
    }

    @Override
    public String currency() {
        return currency;
    }
}


