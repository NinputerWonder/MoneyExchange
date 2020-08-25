package org.wonder;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int times) {
        return new Dollar(this.amount * times);
    }
}

