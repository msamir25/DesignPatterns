package org.example.behaveralPatterns.mediator.mediatorWithObserver;

public class Button extends UiControl {

    private boolean isEnable;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
        notifyObserver();
    }
}
