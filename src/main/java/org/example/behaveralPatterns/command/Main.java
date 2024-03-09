package org.example.behaveralPatterns.command;

import org.example.behaveralPatterns.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackandWhiteCommand());
        composite.execute();
    }
}
