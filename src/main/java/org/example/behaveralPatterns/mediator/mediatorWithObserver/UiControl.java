package org.example.behaveralPatterns.mediator.mediatorWithObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UiControl {
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for (var observer: observers){
            observer.update();
        }
    }


}
