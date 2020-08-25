package org.wonder;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount , currency);
    }

    @Override
    public Money times(int times) {
//        return Money.dollar(amount * times);
        return new Money(amount * times, "USD");
    }
}

