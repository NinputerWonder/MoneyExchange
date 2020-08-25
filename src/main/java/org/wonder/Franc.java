package org.wonder;

import java.util.Objects;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int times) {
        return new Franc(this.amount * times);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Franc)) return false;
        Franc d = (Franc) o;
        return this.amount == d.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
