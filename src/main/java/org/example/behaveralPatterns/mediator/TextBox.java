package org.example.behaveralPatterns.mediator;

public class TextBox extends UiControl{

    private String content;

    public TextBox(DialogBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
