package org.wonder;

import java.util.Objects;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Money)) return false;
        Money d = (Money) o;
        return this.amount == d.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
