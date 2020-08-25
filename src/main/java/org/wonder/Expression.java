package org.wonder;

public interface Expression {
    Money reduce(Bank bank , String to);
}
