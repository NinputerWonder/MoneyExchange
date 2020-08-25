package org.wonder;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int times) {
        return new Franc(this.amount * times);
    }

    @Override
    public String currency() {
        return "CHF";
    }
}


