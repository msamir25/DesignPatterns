package org.example.behaveralPatterns.momento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createContent());

        editor.setContent("b");
        history.push(editor.createContent());

        editor.setContent("c");
        editor.restoreContent(history.pop());
        editor.restoreContent(history.pop());


        System.out.println(editor.getContent());
    }
}
