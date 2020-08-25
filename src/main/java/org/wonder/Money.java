package org.wonder;

import java.util.Objects;

public abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Money)) return false;
        Money money = (Money) o;
        return this.getClass() == o.getClass() &&
                this.amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    abstract public Money times(int times);
}
