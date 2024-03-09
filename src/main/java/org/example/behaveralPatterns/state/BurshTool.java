package org.example.behaveralPatterns.state;

public class BurshTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Bursher Tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed square ");
    }

}
