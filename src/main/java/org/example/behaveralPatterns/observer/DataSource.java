package org.example.behaveralPatterns.observer;

public class DataSource extends Subject{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifitObservers(value);
    }
}
