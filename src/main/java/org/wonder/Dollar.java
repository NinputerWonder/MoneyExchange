package org.wonder;

import java.util.Objects;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int times) {
        return new Dollar(this.amount * times);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Dollar)) return false;
        Dollar d = (Dollar)o;
        return this.amount == d.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
