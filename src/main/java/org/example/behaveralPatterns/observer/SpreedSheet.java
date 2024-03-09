package org.example.behaveralPatterns.observer;

public class SpreedSheet implements Observer{
    @Override
    public void update(int value) {
        System.out.println("this is SpreedSheet: " + value);
    }
}
