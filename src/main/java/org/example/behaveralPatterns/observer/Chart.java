package org.example.behaveralPatterns.observer;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("this is Chart ..: " + value);
    }
}
