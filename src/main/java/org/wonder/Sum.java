package org.wonder;

public class Sum implements Expression {
    private final Expression augend;
    private final Expression addend;
    Sum(Expression augend, Expression addend){
        this.augend = augend;
        this.addend = addend;
    }

    public Expression getAugend() {
        return augend;
    }

    public Expression getAddend() {
        return addend;
    }

    @Override
    public Money reduce(Bank bank , String to) {
        return new Money(augend.reduce(bank, to).amount +
                addend.reduce(bank, to).amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier), addend.times(multiplier));
    }
}
