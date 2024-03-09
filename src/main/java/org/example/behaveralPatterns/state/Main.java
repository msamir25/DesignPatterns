package org.example.behaveralPatterns.state;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new EraseTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
