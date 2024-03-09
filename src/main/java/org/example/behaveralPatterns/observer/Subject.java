package org.example.behaveralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();
    public void addObserever(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifitObservers(int value){
        for (var observer : observers){
            observer.update(value);
        }
    }
}
