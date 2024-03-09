package org.example.behaveralPatterns.command.editor;

public interface UndoableCommand extends Command{

    void unExecute();
}
