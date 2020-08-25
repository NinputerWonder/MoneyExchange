package org.wonder;

public class Bank {
    public Money reduce(Expression expression , String currency) {
        if(expression instanceof Sum){
            Sum sum = (Sum)expression;
            return new Money(sum.getAugend().amount + sum.getAddend().amount, currency);
        }
        return null;
    }
}
