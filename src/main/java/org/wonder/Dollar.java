package org.wonder;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int times) {
        return new Dollar(this.amount * times);
    }

    @Override
    public String currency() {
        return "USD";
    }
}

