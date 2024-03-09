package org.example.behaveralPatterns.mediator.mediatorWithObserver;

public class TextBox extends UiControl {

    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObserver();
    }
}
