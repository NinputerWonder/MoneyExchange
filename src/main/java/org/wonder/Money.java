package org.wonder;

import java.util.Objects;

public class Money {
    protected int amount;

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
}
