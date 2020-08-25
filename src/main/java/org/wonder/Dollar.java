package org.wonder;

import java.util.Objects;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int times) {
        return new Dollar(this.amount * times);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        return o instanceof Dollar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
