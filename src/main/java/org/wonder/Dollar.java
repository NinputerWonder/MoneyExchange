package org.wonder;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int times) {
        this.amount *= times;
    }
}
