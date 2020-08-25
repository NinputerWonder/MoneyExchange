package org.wonder;

import java.util.Hashtable;
import java.util.Objects;

public class Bank {
    private Hashtable<Pair, Integer> rates;

    Bank(){
        rates = new Hashtable<>();
    }

    public Money reduce(Expression expression , String to) {
        return expression.reduce(this, to);
    }

    public void addRate(String from , String to , int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public int rate(String from , String to) {
        return rates.get(new Pair(from, to));
    }
}

