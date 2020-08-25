package org.wonder;

public class Bank {
    public Money reduce(Expression expression , String currency) {
        if(expression instanceof Sum){
            Sum sum = (Sum)expression;
            return sum.reduce(currency);
        }

        if(expression instanceof Money){
            return (Money)expression;
        }

        return null;
    }
}
