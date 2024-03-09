package org.example.behaveralPatterns.command;

import org.example.behaveralPatterns.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Page is Resized /");
    }
}
