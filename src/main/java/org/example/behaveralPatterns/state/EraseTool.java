package org.example.behaveralPatterns.state;

public class EraseTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Erase Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("drow a triangle");
    }
}
