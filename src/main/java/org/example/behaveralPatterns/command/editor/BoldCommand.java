package org.example.behaveralPatterns.command.editor;

public class BoldCommand implements UndoableCommand{

    private String prvContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prvContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unExecute() {
        document.setContent(prvContent);
    }
}
