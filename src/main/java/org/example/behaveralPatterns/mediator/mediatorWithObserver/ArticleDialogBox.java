package org.example.behaveralPatterns.mediator.mediatorWithObserver;

public class ArticleDialogBox {
    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public  ArticleDialogBox(){
        articleListBox.attach(this::articleSelected);
        titleTextBox.attach(this::titleSelected);
    }

    public void simulateInteraction(){
        articleListBox.setSelection("Artical 1");
        titleTextBox.setContent("");
        System.out.println("TextBox is : " + titleTextBox.getContent());
        System.out.println("Button : "+ saveButton.isEnable());
    }


    private void titleSelected(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }
    private void articleSelected(){
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);
    }
}
