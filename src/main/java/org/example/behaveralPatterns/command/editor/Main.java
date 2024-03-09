package org.example.behaveralPatterns.command.editor;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();

        document.setContent("hello World");

        var blodCommand = new BoldCommand(document , history);

        blodCommand.execute();
        System.out.println(document.getContent());

        blodCommand.unExecute();
        System.out.println(document.getContent());
    }
}
