package org.example.behaveralPatterns.mediator;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateInteraction(){
        articleListBox.setSelection("Artical 1");
        titleTextBox.setContent("");
        System.out.println("TextBox is : " + titleTextBox.getContent());
        System.out.println("Button : "+ saveButton.isEnable());
    }
    @Override
    public void changed(UiControl control) {
        if (control == articleListBox){
            articleSelected();
        } else if (control == titleTextBox) {
            titleSelected();
        }
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
