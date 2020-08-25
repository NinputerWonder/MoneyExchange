package org.wonder;

public class Sum implements Expression {
    private final Money augend;
    private final Money addend;

    Sum(Money augend , Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money getAugend() {
        return augend;
    }

    public Money getAddend() {
        return addend;
    }

    public Money reduce(String currency) {
        return new Money(augend.amount + addend.amount, currency);
    }
}