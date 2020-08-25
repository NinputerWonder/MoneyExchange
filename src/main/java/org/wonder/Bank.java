package org.wonder;

public class Bank {
    public Money reduce(Expression expression, String to) {
        return expression.reduce(to);
    }

    public void addRate(String origin , String to , int rate) {

    }
}
