package org.example.behaveralPatterns.command;

import org.example.behaveralPatterns.command.fx.Command;

public class BlackandWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black White Page ");
    }
}

