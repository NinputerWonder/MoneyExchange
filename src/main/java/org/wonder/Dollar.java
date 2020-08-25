package org.wonder;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int times) {
        return Money.dollar(amount * times);
    }

    @Override
    public String currency() {
        return currency;
    }
}

