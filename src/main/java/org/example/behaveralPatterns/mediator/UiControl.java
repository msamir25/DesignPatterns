package org.example.behaveralPatterns.mediator;
//mediator Class
public class UiControl {
    protected DialogBox owner;

    public UiControl(DialogBox owner) {
        this.owner = owner;
    }
}
