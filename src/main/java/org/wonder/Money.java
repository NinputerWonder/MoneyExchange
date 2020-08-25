package org.wonder;

import java.util.Objects;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!(o instanceof Money)) return false;
        Money money = (Money) o;
        return this.currency.equals(money.currency) &&
                this.amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money times(int times){
        return new Money(amount * times, currency);
    }

    public String currency() {
        return currency;
    }
}
