package org.example.behaveralPatterns.mediator.mediatorWithObserver;

public class ListBox extends UiControl {
    private String selection;
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyObserver();
    }
}
