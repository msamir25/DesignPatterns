package org.example.behaveralPatterns.momento;

public class Editor {

    private  String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createContent(){
        return new EditorState(content);
    }

    public void restoreContent(EditorState state){
        content = state.getContent();
    }

}
